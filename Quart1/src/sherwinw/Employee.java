package sherwinw;

public class Employee
{
	private String name;
	private double salary;
	
	public Employee()
	{
		this.name = "John Doe";
		this.salary = 0.0;
	}
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	public String getName()
	{
		return name;
	}
	public String getSalary()
	{
		return String.format("%.2f", this.salary);
	}
	
	void raiseSalary(double byPercent)
	{
		this.salary = ((byPercent/100) + 1) * salary;
	}
}
