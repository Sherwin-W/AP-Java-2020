package sherwinw;

import javax.swing.JOptionPane;

public class MaxandMinTest 
{
	public static void main(String[] args)
	{
		
		double w = Integer.parseInt(JOptionPane.showInputDialog("Enter your first number..."));
		
		double x = Integer.parseInt(JOptionPane.showInputDialog("Enter your second number..."));
		
		double y = Integer.parseInt(JOptionPane.showInputDialog("Enter your third number..."));
		
		double z = Integer.parseInt(JOptionPane.showInputDialog("Enter your fourth number..."));
		
		double max = Math.max(Math.max(w,x) , Math.max(y,z));
		double min = Math.min(Math.min(w,x) , Math.min(y,z));
		
		System.out.println("The maximum is..." + max);
		System.out.println("The minimum is..." + min);
		
	}

}
