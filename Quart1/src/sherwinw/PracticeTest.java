package sherwinw;

public class PracticeTest 
{

	public static void main(String[] args) 
	{
		EasyReader kboard = new EasyReader();
		
		System.out.println("Please enter the first number (int)");
		int x = kboard.readInt();
		
		System.out.println("Please enter the second number (double)");
		double y = kboard.readDouble();
		
		
		
		System.out.println("The first number is " + x);
		System.out.println("The second number is " + y);
	}

}
