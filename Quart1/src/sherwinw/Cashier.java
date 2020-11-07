package sherwinw;

public class Cashier 
{
	private final double amountOwed;
	private final double amountReceived;
	
	private final int DOLLAR_VALUE = 100;
	private final int QUARTER_VALUE = 25;
	private final int DIME_VALUE = 10;
	private final int NICKEL_VALUE = 5;
	private final int PENNY_VALUE = 1;
	
	public Cashier(double amountOwed, double amountReceived)
	{
		this.amountOwed = amountOwed;
		this.amountReceived = amountReceived;
	}
	
	
	int getDollars ()
	{
		double change = amountReceived - amountOwed;
		int dollars = (int)((100*change)/DOLLAR_VALUE);
		return dollars;
	}
	
	int getQuarters ()
	{
		double change = amountReceived - amountOwed;
		int quarters = (int)((100*change)%DOLLAR_VALUE/QUARTER_VALUE);
		return quarters;
	}
	
	int getDimes ()
	{
		double change = amountReceived - amountOwed;
		int dime = (int)((100*change)%DOLLAR_VALUE%QUARTER_VALUE/DIME_VALUE);
		return dime;
	}	
	
	int getNickels ()
	{
		double change = amountReceived - amountOwed;
		int nickel = (int)((100*change)%DOLLAR_VALUE%QUARTER_VALUE%DIME_VALUE/NICKEL_VALUE);
		return nickel;
	}	
		
	int getPennies ()
	{
		double change = amountReceived - amountOwed;
		int penny = (int)((100*change)%DOLLAR_VALUE%QUARTER_VALUE%DIME_VALUE%NICKEL_VALUE/PENNY_VALUE);
		return penny;
	}
}

