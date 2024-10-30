package onlineCabBookingLLD.model;

import java.util.HashMap;
import java.util.Map;

public class DriverMgr {
	
	private static DriverMgr driverManager;
	private Map<String, Driver> driverList = new HashMap<>();
	
	private DriverMgr() {}
	
	
	public static DriverMgr getDriverManagerInstance() {
		if(driverManager == null)
			driverManager = new DriverMgr();
		return driverManager;
	}
	
	public void addDriver(String id, Driver driver) {
		driverList.putIfAbsent(id, driver);
	}
	
	public Driver getDriver(String id) {
		return driverList.getOrDefault(id, null);
	}
	
	public Driver getAvailableDriver() {
		for(Driver driver: driverList.values()) {
			if (driver.isAvailable()){
				return driver;
			}
		}
		return null;
	}
	

}
