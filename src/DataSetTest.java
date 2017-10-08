import java.util.Scanner;

/*
 	Susan Gee, Period 5, DataSetTest.java program
 */

public class DataSetTest 
{
	public static void main(String[ ] args)
	{
		
		Scanner console = new Scanner(System.in);		//Scanner class for data input from the console
		System.out.print("Enter four integers: ");
		int num1 = console.nextInt( );
		int num2 = console.nextInt( );
		int num3 = console.nextInt( );
		int num4 = console.nextInt( );
		
		DataSet myData = new DataSet( );
		myData.addValue(num1);
		myData.addValue(num2);
		myData.addValue(num3);
		myData.addValue(num4);
		
		
		System.out.println("The largest integer is " + myData.getLargest());			//print the values
		System.out.println("The smallest integer is " + myData.getSmallest());
		
		console.close();
		
		/*
		 	A program that reads four integers and prints 
		 	the largest and smallest value from user input at the console.
		 */
	}
}
