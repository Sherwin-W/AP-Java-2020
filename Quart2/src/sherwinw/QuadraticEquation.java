package sherwinw;

public class QuadraticEquation {
	
	private double a;
	private double b;
	private double c;
	
	private double d;
	
	public QuadraticEquation( double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		d = (b * b) - (4 * a * c);
	}
	
	public boolean hasSolution() {
		if (d < 0) {
			return false;
		}
		return true;
		
	}
	
	public double getSolution1() {
			return (-b + d)/ (2 * a);
	}
	
	public double getSolution2() {
			return (-b - d)/ (2 * a);
	}
}