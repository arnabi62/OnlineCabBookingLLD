package onlineCabBookingLLD.strategy;

public class DefaultPriceStrategy implements PriceStrategy{
	
	private final double rate = 10.00;

	@Override
	public double calculatePrice(double distance) {
		// TODO Auto-generated method stub
		return rate * distance;
	}
	

}
