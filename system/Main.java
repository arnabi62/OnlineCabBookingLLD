package onlineCabBookingLLD.system;

import onlineCabBookingLLD.model.Rider;
import onlineCabBookingLLD.model.RiderManager;
import onlineCabBookingLLD.model.Driver;
import onlineCabBookingLLD.model.DriverMgr;
import onlineCabBookingLLD.logic.Trip;
import onlineCabBookingLLD.logic.TripManager;
import onlineCabBookingLLD.strategy.*;

public class Main {

	public static void main(String[] args) {
		
		Rider rider = new Rider("1", "John");
        RiderManager.getRiderManagerInstance().addRider(rider.getId(), rider); 

        Driver driver = new Driver("driver1", "Alice");
        DriverMgr.getDriverManagerInstance().addDriver(driver.getId(),driver);

        // Using Basic Pricing Strategy
        TripManager tripManager = new TripManager(new DefaultPriceStrategy());
        Trip trip = tripManager.createTrip(rider.getId(), 10);
        System.out.println(trip.getPrice());
        System.out.println(trip.getRating());
        tripManager.closeTrip(trip.getId(), 5);
        System.out.println(trip.getRating());

	}

}
