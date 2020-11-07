package sherwinw;

public class SodaCanTest 
{
	public static void main (String[] args)
	{
		SodaCan can1 = new SodaCan(4.25, 2.0);
		
		System.out.println(can1.toString());
		
		System.out.println("surface area = " +  can1.getsurfaceArea());
		System.out.println("volume = " + can1.getVolume());
	}

}
