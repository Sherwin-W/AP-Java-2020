package sherwinw;

public class PointTest 
{
	public static void main(String[] args)
	{
		double x1 = 3;
		double y1 = 4;
		double x2 = 5;
		double y2 = 8;
		Point pointone = new Point(x1,y1);
		Point pointtwo = new Point(x2,y2);
		
		System.out.println("The given points are " + pointone.getPoint() + "and " + pointtwo.getPoint());
		System.out.println("The slope in fraction form is " + pointone.calculateSlopeFraction(x2,y2));
		System.out.println("The slope in decimal form is " + pointone.calculateSlope(pointtwo.getX(), pointtwo.getY()));
		System.out.println("The equation of the line is y = " + pointone.calculateSlope(x2,y2) + "x" + pointone.calculateYIntercept(x2, y2));
		System.out.println("The midpoint is " + pointone.getMidPoint(x2, y2));
		System.out.println("The distance between the points is " + pointone.calculateDistance(x2,y2));
	}
}
