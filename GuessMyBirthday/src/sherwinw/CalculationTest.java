package sherwinw;

import java.io.IOException;
import javax.swing.JOptionPane;


public class CalculationTest 
{
	public static void main (String[] args) throws IOException
	{
		String str = "";
		str = str + "This program will guess your birthday and month" + '\n';
		str = str + "Answer the following questions and do the simple math" + '\n' + '\n';
		System.out.println("Hi There");
		str = str + "1. Take the number of the month that you were born 1 - Jan, 2 - Feb, etc" + '\n';
		str = str + "2. Double the month number" + '\n';
		str = str + "3. Next add 6" + '\n';
		str = str + "4. Multiply the result by 50" + '\n';
		str = str + "5. Add the day of the month that you were born" + '\n';
		str = str + "6. Subtract 365 from the number" + '\n';
		JOptionPane.showMessageDialog(null,str);
		
		String input = JOptionPane.showInputDialog("Enter this number into the computer");
		int count = Integer.parseInt(input);
		Calculation number = new Calculation(count);
		number.finalCalculation(count);
		String ans = "";
		
		ans = ans + "You were born in month" + number.getMonth() + '\n';
		ans = ans + "You were born on day" + number.getDay() + '\n';
		JOptionPane.showMessageDialog(null, ans);
	}
}
