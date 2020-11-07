package sherwinw;

public class Calculation 
{
	//instance fields
	private int value;
	private int month;
	private int day;
	
	//Constructor with parameter
	public Calculation(int value)
	{
			this.value = value;
	}
	
	public void finalCalculation(int current)
	{
			value = current + 65;
			month = value/100;
			day = value - month*100;
	}
	public int getMonth()
	{
			return month;
	}
	public int getDay()
	{
			return day;
	}
}
