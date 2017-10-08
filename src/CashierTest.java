import java.util.Scanner;

/*
 	Susan Gee , Period 5 , CashierTest.java program
 */

public class CashierTest 
{
	public static void main(String [ ] args)
	{
		Scanner keyboard = new Scanner(System.in);								//Scanner class for data input from the console
		System.out.print("Enter the amount due in dollars and cents: $");
		double theDue = keyboard.nextDouble( );
		System.out.print("Enter the amount received: $");
		double theReceived = keyboard.nextDouble( );
		
		Cashier susan = new Cashier( );
		
		susan.setAmountDue(theDue);
		susan.receive(theReceived);
		
		int dollars = susan.returnDollars( );
		int quarters = susan.returnQuarters( );
		int dimes = susan.returnDimes( );
		int nickels = susan.returnNickels( );
		int pennies = susan.returnPennies( );
		
		System.out.println("Give the customer \n"			//prints the values
				+ dollars + " dollars, \n"
				+ quarters + " quarters, \n"
				+ dimes + " dimes, \n"
				+ nickels + " nickels, \n"
				+ pennies + " pennies, \n");
		
		keyboard.close( );
		
		/*
		 	A program that directs a cashier how to give change. 
		 	The program has two inputs for the amount to be paid 
		 	and for the amount received from the customer.
		 */
		
	}
}
