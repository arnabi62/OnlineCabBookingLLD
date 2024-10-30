package onlineCabBookingLLD.logic;

import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;


import onlineCabBookingLLD.model.Driver;
import onlineCabBookingLLD.model.DriverMgr;
import onlineCabBookingLLD.model.RiderManager;
import onlineCabBookingLLD.strategy.PriceStrategy;

public class TripManager {
	
	private PriceStrategy priceStrategy;
	private DriverMgr driverManager = DriverMgr.getDriverManagerInstance();
	private RiderManager riderManager = RiderManager.getRiderManagerInstance();
	private Map<Integer, Trip> tripList = new HashMap<>();
	private Integer id = 1;
	
	public TripManager(PriceStrategy priceStrategy) {
		// TODO Auto-generated constructor stub
		this.priceStrategy = priceStrategy;
	}
	
	public Trip createTrip(String riderId, double distance) {
		Driver driver = driverManager.getAvailableDriver();
		if (driver == null) {
			System.out.println("No drivers available");
		}
		String driverId = driver.getId();
		driver.setAvailability(false);
		double price = priceStrategy.calculatePrice(distance);
		Trip trip = new Trip(id, riderId, driverId, distance, price);
		tripList.put(id++, trip);
		System.out.println(trip);
		return trip;
		}
	
	public void closeTrip(Integer id, Integer rating) {
		tripList.get(id).setRating(rating);
		return;
	}

}
