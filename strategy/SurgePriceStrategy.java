package onlineCabBookingLLD.strategy;

public class SurgePriceStrategy implements PriceStrategy{

	private final double rate = 12.00;
	@Override
	public double calculatePrice(double distance) {
		// TODO Auto-generated method stub
		return rate * distance;
	}

}
