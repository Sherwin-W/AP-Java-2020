package sherwinw;

public class RoachPopulation 
{
	private double population;
	private int count;
	
	public RoachPopulation(double population)
	{
		this.population = population;
	}
	
	public void waitForDoubling()
	{
		this.population = population * 2;
	}
	
	public void spray()
	{
		this.population = population * 0.9;
	}
	
	public void getRoaches()
	{
		waitForDoubling();
		spray();
		count += 1;
//		return population;
	}
	public String toString() {
		String result = "After " + this.count + " wait period(s): " +
						this.population + "roaches";
		System.out.println(result);
		return result;
	}
}
