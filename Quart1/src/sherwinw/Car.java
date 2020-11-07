package sherwinw;

public class Car 
{
	private double efficiency;
	private double fuelLevel;
	private double fuel;
	private double miles;
	
	public Car (double efficiency)
	{
		this.efficiency = efficiency;
		this.fuelLevel = 0;
	}
	public double getEfficiency()
	{
		return this.efficiency;
	}
	public double getfuelLevel()
	{
		return this.fuelLevel;
	}
	
	public void addGas(double fuel)
	{
		fuelLevel = fuelLevel + fuel;
		this.fuel = fuel;
	}
	public double getfuel()
	{
		return this.fuel;
	}

	public void drive(double miles)
	{
		double fuelLeft = fuelLevel - (miles / efficiency);
		if (fuelLeft < 0) {
			System.out.println("The Car can only drive " + String.format("%.2f", this.fuelLevel*this.efficiency) + " miles.");
			fuelLevel = 0;
		}
		this.miles = miles;
	}
	public double getmiles()
	{
		return this.miles;
	}
}
