/**
 * 
 */
package onlineCabBookingLLD.model;

/**
 * @author 91789
 *
 */
public class Driver {
	private String id;
	private String name;
	private Integer rating;
	private boolean availability;
	
	public Driver(String id,String name) {
		this.id = id;
		this.name = name;
		this.rating = 0;
		this.availability = true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public boolean isAvailable() {
		return this.availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	

	

}
