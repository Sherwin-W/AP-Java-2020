package sherwinw;

public class ThreeNumbers {

	private double a;
	private double b;
	private double c;
	private double largest;
	private double middle;
	private double smallest;
	
	public ThreeNumbers(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		if (a < b && a < c) {
			a = smallest;
		}
		
		if (b < a && b < c) {
			b = smallest;
		}
	
		if ((a < b || a < c) && (a > c || a > b)) {
			a = middle;
		}
	
		if ((b < a || b < c) && (b > c || b > a)) {
			b = middle;
		}
		
		if (a > b && a > c) {
			a = smallest;
		}
		
		if (b > a && b > c) {
			b = smallest;
		}
		
		else
			 c = smallest;
			 c = middle;
			 c = largest;
	}
			
	
	public double getSmallest() {
		return smallest;
	}
	
	public double getMiddle() {
		return middle;
	}
	
	public double getLargest() {
		return largest;
	}
}
