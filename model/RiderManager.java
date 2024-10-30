package onlineCabBookingLLD.model;

import java.util.HashMap;
import java.util.Map;

public class RiderManager {
	

	private static RiderManager riderManager;
	private Map<String, Rider> riderList = new HashMap<>();
	
	private RiderManager() {}
	
	
	public static RiderManager getRiderManagerInstance() {
		if(riderManager == null)
			riderManager = new RiderManager();
		return riderManager;
	}
	
	public void addRider(String id, Rider rider) {
		riderList.putIfAbsent(id, rider);
	}
	
	public Rider getRider(String id) {
		return riderList.getOrDefault(id, null);
	}

}
