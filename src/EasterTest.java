import javax.swing.JOptionPane;

/*
 	Susan Gee , Period 5 , EasterTest.java program
 */

public class EasterTest 
{
	public static void main(String [ ] args)
	{
		String input1 = JOptionPane.showInputDialog("1. Please enter the year:");		//show input dialog
		int year1 = Integer.parseInt(input1);
		
		String input2 = JOptionPane.showInputDialog("2. Please enter the year:");
		int year2 = Integer.parseInt(input2);
		
		Easter myEaster1 = new Easter(year1);
		
		System.out.println("Easter Sunday for " + year1);				//print month and date first time
		System.out.println("month: " + myEaster1.getMonthName( ));  
		System.out.println("date:  " + myEaster1.getDay( )); 
		
		System.out.println("");
		
		Easter myEaster2 = new Easter(year2);
		
		System.out.println("Easter Sunday for " + year2);				//print month and date second time
		System.out.println("month: " + myEaster2.getMonthName( ));  
		System.out.println("date:  " + myEaster2.getDay( )); 
		
		
		System.exit(0);
		
		
		/*
		 	A program to compute the date of Easter Sunday.
		 	Easter Sunday is the first Sunday after the first full moon of Spring.
		 	Use the algorithm for the class, invented by mathematician Carl Friedrich Gauss in the year 1800.
		 */
		
	}
}
