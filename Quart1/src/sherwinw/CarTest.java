package sherwinw;

public class CarTest 
{
	public static void main (String[] args)
	{
		//double distance_1 = 100;
		//double distance_2 = 2000;
		//double fuel_1 = 20;
		//double fuel_2 = 10;
		
		Car mybeemer = new Car(29); 
		
		System.out.println("Fuel Efficiency: " + mybeemer.getEfficiency() + "(mpg)");
		System.out.println("Starting Fuel Level: " + mybeemer.getfuelLevel() + "(gallons)");
		
		mybeemer.addGas(20);
		
		System.out.println("Gas Added: " + mybeemer.getfuel() + "(gallons)" );
		System.out.println("New Fuel Level: " + mybeemer.getfuelLevel() + "(gallons)");
		
		mybeemer.drive(100);
		
		System.out.println("Miles Driven: " + mybeemer.getmiles() + "(miles)");
		System.out.println("Gas Remaining: " + mybeemer.getfuelLevel() + "(gallon)"); 
		
		mybeemer.addGas(10);
		
		System.out.println("Gas Added: " + mybeemer.getfuel() + "(gallons)" );
		System.out.println("New Fuel Level: " + mybeemer.getfuelLevel());
		
		mybeemer.drive(2000);
		
		System.out.println("Miles Driven: " + mybeemer.getmiles() + "(miles)");
		System.out.println("Gas Remaining: " + mybeemer.getfuelLevel() + "(gallon)"); 
	}
}
