package onlineCabBookingLLD.model;

public class Rider {

	private String id;
	private String name;
	private Integer rating;

	
	public Rider(String id,String name) {
		this.id = id;
		this.name = name;
		this.rating = 0;
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

	
}
