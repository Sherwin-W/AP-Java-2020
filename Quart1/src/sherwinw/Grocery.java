package sherwinw;

public class Grocery 
{
	private String name;
	private int quantity;
	private double price;
	
	//parameterized constructor
	public Grocery(String name, int quant, double price)
	{
		this.name = name;
		this.quantity = quant;
		this.price = price;
	}
	public String getItem()		//getter
	{
		return name;
	}
	
	public double calculateUnitPrice()
	{
		return this.price/this.quantity;
	}

}
