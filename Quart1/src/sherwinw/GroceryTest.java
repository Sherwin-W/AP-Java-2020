package sherwinw;

public class GroceryTest 
{
	public static void main(String[] args)
	{
		Grocery Item1 = new Grocery("oranges" , 10 , 2.99);
		Grocery Item2 = new Grocery("eggs" , 12, 1.69);
		Grocery Item3 = new Grocery("apples" , 3 , 1.00);
		Grocery Item4 = new Grocery("watermelon" , 1 , 4.39);
		Grocery Item5 = new Grocery("bagels" , 6 , 3.15);
				
		System.out.println(Item1.getItem() + "    " + Item1.calculateUnitPrice());		
		System.out.println(Item2.getItem() + "    " + Item2.calculateUnitPrice());	
		System.out.println(Item3.getItem() + "    " + Item3.calculateUnitPrice());
		System.out.println(Item4.getItem() + "    " + Item4.calculateUnitPrice());
		System.out.println(Item5.getItem() + "    " + Item5.calculateUnitPrice());
	}

}
