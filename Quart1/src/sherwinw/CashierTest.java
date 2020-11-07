package sherwinw;

import javax.swing.JOptionPane;

public class CashierTest 
{
	public static void main(String[] args)
	{
		double amountOwed = Double.parseDouble(JOptionPane.showInputDialog("Please enter cost... ($)"));
		
		double amountReceived = Double.parseDouble(JOptionPane.showInputDialog("Please enter amount of payment... ($)"));
	
		Cashier action1 = new Cashier(amountOwed, amountReceived);
		
		String answer = "Dollars returned: " + action1.getDollars() + '\n' + 
						"Quarters returned: " + action1.getQuarters() + '\n' + 
						"Dimes returned: " + action1.getDimes() + '\n' + 
						"Nickels returned: " + action1.getNickels() + '\n' + 
						"Pennies returned: " + action1.getPennies();
		JOptionPane.showMessageDialog(null, answer);
		
		//System.out.println("Dollars returned: " + action1.getDollars());
		//System.out.println("Quarters returned: " + action1.getQuarters());
		//System.out.println("Dimes returned: " + action1.getDimes());
		//System.out.println("Nickels returned: " + action1.getNickels());
		//System.out.println("Pennies returned: " + action1.getPennies());
	}
}