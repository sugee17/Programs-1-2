import javax.swing.JOptionPane;

/*
 	Susan Gee, Period 5, ConverterTest.java program
 */

public class ConverterTest 
{
	public static void main(String [ ] args)
	{
		final double MILE_TO_M = 1609;
		final double FEET_TO_M = 0.305;
		final double INCHES_TO_M = 0.025;
		
		String input = JOptionPane.showInputDialog("Enter a distance in meters: ");		//display input dialog 
		int meter = Integer.parseInt(input);
		
		Converter metersToMiles = new Converter(1 * MILE_TO_M);
		Converter metersToFeet = new Converter(1 * FEET_TO_M);
		Converter metersToInches = new Converter(1 * INCHES_TO_M);
		
		
		System.out.println(meter + " meters is the same as: ");						//print the values
		System.out.printf("%.3f miles \n", metersToMiles.convertTo(meter));
		System.out.printf("%,.3f feet \n", metersToFeet.convertTo(meter));
		System.out.printf("%,.3f inches \n", metersToInches.convertTo(meter));
		
		
		/*
		 	A program that prompts the users for a measurement in 
		 	meters then converts it into miles, feet, and inches.
		 */
	}
}
