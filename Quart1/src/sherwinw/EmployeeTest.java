package sherwinw;

public class EmployeeTest 
{
	public static void main (String[] args)
	{
		Employee name1 = new Employee();
		Employee name2 = new Employee("Horatio Hornblower", 80000.0);
		Employee name3 = new Employee("Hacker, Harry", 55000);
		
		name3.raiseSalary(10);
		
		System.out.println("Employee 1: \n" + "   Name: " + name1.getName() + "\n   Salary: $" + name1.getSalary());
		System.out.println("    ");
		System.out.println("Employee 2: \n" + "   Name: " + name2.getName() + "\n   Salary: $" + name2.getSalary());
		System.out.println("    ");
		System.out.println("Employee 2: \n" + "   Name: " + name3.getName() + "\n   Salary: $" + name3.getSalary());
		
	}
}
