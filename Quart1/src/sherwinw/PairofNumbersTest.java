package sherwinw;



public class PairofNumbersTest 
{
	public static void main(String[] args)
	{
		
		EasyReader kboard = new EasyReader();
		
		System.out.println("Please enter the first number ... ");
		int x = kboard.readInt();
		
		System.out.println("Please enter the second number ... ");
		int y = kboard.readInt();
		
		PairofNumbers Pair = new PairofNumbers(x, y);
		

		
		System.out.println("The sum of the two numbers is ..." + Pair.getSum(x, y));
		
		System.out.println("The difference of the two numbers is ..." + Pair.getDifference(x, y));
		
		System.out.println("The product of the two numbers is ..." + Pair.getProduct(x, y));
		
		System.out.println("The average of the two numbers is ..." + Pair.getAverage(x, y));
		
		System.out.println("The distance betweeen the two numbers is ..." + Pair.getDistance(x, y));
		
		if(x >= y) 
		{
			System.out.println("The Maximum is ... " + x);
		}
		else 
		{
			System.out.println("The Maximum is ... " + y);
		}
		
		if(x >= y) 
		{
			System.out.println("The Minimum is ... " + y);
		}
		else 
		{
			System.out.println("The Minimum is ... " + x);
		}
		
		

	}
}
