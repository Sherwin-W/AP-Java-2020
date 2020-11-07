package sherwinw;

public class ThreeNumbersTest {

	public static void main(String [] args) {
		
		EasyReader file1 = new EasyReader("Number.dat");
		System.out.println("First set of inputs: ");
		double a = file1.readDouble();
		double b = file1.readDouble();
		double c = file1.readDouble();
		
		ThreeNumbers Triple1 = new ThreeNumbers(a,b,c);
		
		System.out.println("Sorted inputs: " + " " + EasyFormat.format(Triple1.getSmallest(), 6, 1) + " " +
				EasyFormat.format(Triple1.getMiddle(), 6, 1) + " " + EasyFormat.format(Triple1.getLargest(), 6, 1));
		
		System.out.println("Second set of inputs: ");
		double d = file1.readDouble();
		double e = file1.readDouble();
		double f = file1.readDouble();
		
		ThreeNumbers Triple2 = new ThreeNumbers(d,e,f);
		
		System.out.println("Sorted inputs: " + " " + EasyFormat.format(Triple2.getSmallest(), 6, 1) + " " +
				EasyFormat.format(Triple2.getMiddle(), 6, 1) + " " + EasyFormat.format(Triple2.getLargest(), 6, 1));
		
		System.out.println("Third set of inputs: ");
		double g = file1.readDouble();
		double h = file1.readDouble();
		double i = file1.readDouble();
		
		ThreeNumbers Triple3 = new ThreeNumbers(g,h,i);
		
		System.out.println("Sorted inputs: " + " " + EasyFormat.format(Triple3.getSmallest(), 6, 1) + " " +
				EasyFormat.format(Triple3.getMiddle(), 6, 1) + " " + EasyFormat.format(Triple3.getLargest(), 6, 1));
		
		
		
	}
}
