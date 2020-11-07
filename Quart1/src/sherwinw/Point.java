package sherwinw;

public class Point 
{
	private double x;
	private double y;
	
	public Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Point()	// default constructor
	{
		this.x = 0;
		this.y = 0;
		
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public String getPoint()
	{
		return "( "+x+" , "+y+" )";
	}
	
	public double calculateSlope(double x2, double y2)
	{
		double slope = (y2-y)/(x2-x);
		return slope;
	}
	public String calculateSlopeFraction(double x2, double y2)
	{
		return ""+ (y2-y) +" / "+(x2-x);
	}
	public String getMidPoint(double x2, double y2)
	{
		return "( "+(x+x2)/2+" , "+(y+y2)/2+" )";
				
	}
	public double calculateDistance(double x2, double y2)
	{
		double distance = Math.sqrt(Math.pow(x2-x, 2) + Math.pow(y2-y,  2));
		return distance;
	}
	public double calculateYIntercept(double x2, double y2)
	{
		double YIntercept = y2 - (x2 * ((y2-y)/(x2-x)));
		return YIntercept;
	}
}
