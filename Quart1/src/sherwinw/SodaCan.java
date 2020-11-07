package sherwinw;

public class SodaCan 
{
	final double pi = 3.14159;
	private double height;
	private double radius;
	private double surfaceArea;
	private double volume;
	
	public SodaCan(double height, double radius)
	{
		this.height = height;
		this.radius = radius;
	}
	
	public double getsurfaceArea()
	{
		this.surfaceArea = (2 * pi * radius * radius) + (2 * pi * radius * height);
		return this.surfaceArea;
	}
	public double getVolume()
	{
		this.volume = pi * radius * radius * height;
		return this.volume;
	}
	
	public String toString()
	{
		String result = "Dimensions of the can:\n" +
						"\theight = " + this.height + "\n" +
						"\tradius = " + this.radius + "\n";
						
		return result;
	}
}
