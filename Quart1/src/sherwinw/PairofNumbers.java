package sherwinw;

import java.lang.Math;

public class PairofNumbers 
{
	double x;
	double y;
	
	
	public PairofNumbers(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getSum(double x, double y)
	{
		double sum = this.x + this.y;
		return sum;
	}	
	
	public double getDifference(double x, double y)
	{
		double difference = this.x - this.y;
		return difference;
	}
	
	public double getProduct(double x, double y)
	{
		double product = this.x * this.y;
		return product;	
	}
	
	public double getAverage(double x , double y)
	{
		double average = (x + y)/2.0;
		return average;
	}	
	
	public double getDistance(double x, double y)
	{
		double distance = Math.abs(this.x - this.y);
		return distance;
	}
	
}
