package sherwinw;

public class RoachPopulationTest 
{
	public static void main (String[] args)
	{
		RoachPopulation Pop1 = new RoachPopulation(10);
		
		Pop1.getRoaches();
		Pop1.toString();
		Pop1.getRoaches();
		Pop1.toString();
		Pop1.getRoaches();
		Pop1.toString();
//		Pop1.WaitForDoubling();
//		Pop1.spray();
//		System.out.println("After 1 wait period: " + Pop1.getRoaches() + " roaches");
//		
//		Pop1.WaitForDoubling();
//		Pop1.spray();
//		System.out.println("After 2 wait periods: " + Pop1.getRoaches() + " roaches");
//		
//		Pop1.WaitForDoubling();
//		Pop1.spray();
//		System.out.println("After 3 wait periods: " + Pop1.getRoaches() + " roaches");	
	}

}
