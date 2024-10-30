package onlineCabBookingLLD.logic;

public class Trip {
	
	private String riderId;
	private Integer id;
	private String driverId;
	private double distance;
	private Integer rating;
	private double price;
	
	
	public Trip(Integer id, String riderId, String driverId, double distance, double price) {
		this.id = id;
		this.riderId = riderId;
		this.driverId = driverId;
		this.distance = distance;
		this.rating = 0;
		this.price = price;
	}
	public String getRiderId() {
		return riderId;
	}
	public void setRiderId(String riderId) {
		this.riderId = riderId;
	}
	
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Integer getId() {
		return this.id;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Trip id: " + id);
		return id.toString();
	}
	
	

}
