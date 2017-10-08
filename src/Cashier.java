/*
 	Susan Gee , Period 5 , Cashier.java program
 */

public class Cashier 
{
	//Construct the coin values the cashier uses to provide change
	public Cashier( )
	{
		pennies = 1;
		nickels = 5;
		dimes = 10;
		quarters = 25;
		dollars = 100;
	}
	
	//Sets the amount that is due 
	public void setAmountDue(double anAmountDue)
	{
		amountDue = anAmountDue;
	}
	
	//Amount received from customer
	public void receive(double amountReceived)
	{
		received = amountReceived;
	}
	
	//Amount in dollars returned 
	public int returnDollars( )
	{
		change = (int) (dollars * (received - amountDue));
		return change / dollars;
	}
	
	//Amount in quarters returned
	public int returnQuarters( )
	{
		change = change % dollars;
		return change / quarters;
	}
	
	//Amount in dimes returned
	public int returnDimes( )
	{
		change = change % quarters;
		return change / dimes;
	}
	
	//Amount in nickels returned
	public int returnNickels( )
	{
		change = change % dimes;
		return change / nickels;
	}
	
	//Amount in pennies returned
	public int returnPennies( )
	{
		return change % nickels;
	}

	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	private int dollars;
	private int change;
	private double amountDue;
	private double received;
	
}
