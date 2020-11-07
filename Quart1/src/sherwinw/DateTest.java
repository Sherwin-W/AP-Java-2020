package sherwinw;

import javax.swing.JOptionPane;

public class DateTest 
{
	public static void main(String[] args)
	{
		int y = Integer.parseInt(JOptionPane.showInputDialog("Enter the year... "));
		
		Date EasterSunday = new Date (y);
		
		//System.out.println("Easter Sunday for " + y);
		//System.out.println("month: " + EasterSunday.getMonth());
		//System.out.println("date: " + EasterSunday.getDay());
		
		String answer = "Easter Sunday for " + y + '\n'
				+ "month: " + EasterSunday.getMonth() + '\n'
				+ "date: " + EasterSunday.getDay();
		JOptionPane.showMessageDialog(null, answer);
		
		
		
	}
}
