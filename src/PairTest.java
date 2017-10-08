import javax.swing.JOptionPane;

/*
 	Susan Gee, Period 5, PairTest.java program
 */

public class PairTest 
{
	public static void main(String [ ] args)
	{
		Pair numPair = new Pair( );
		
		String first = JOptionPane.showInputDialog("Enter FIRST number: ");			//show input dialog
		int aFirst = Integer.parseInt(first);
		numPair.numFirst(aFirst);
		String second = JOptionPane.showInputDialog("Enter SECOND number: ");
		int aSecond = Integer.parseInt(second);
		numPair.numSecond(aSecond);
		
		Pair numeroPar = new Pair(aFirst, aSecond);
		
		double aSum = numeroPar.getSum( );
		double aDifference = numeroPar.getDifference( );
		double aProduct = numeroPar.getProduct( );
		double aAverage= numeroPar.getAverage( );
		double aDistance = numeroPar.getDistance( );
		double aMaximum = numeroPar.getMaximum( );
		double aMinimum = numeroPar.getMinimum( );
		
		System.out.println("First number: " + aFirst);				//print the values
		System.out.println("Second number: " + aSecond);
		System.out.println("The sum: " + aSum);
		System.out.println("The difference: " + aDifference);
		System.out.println("The product: " + aProduct);
		System.out.println("The average: " + aAverage);
		System.out.println("The distance: " + aDistance);
		System.out.println("The maximun: " + aMaximum);
		System.out.println("The minimum: " + aMinimum);
		
		System.exit(0);
		
		
		/*
		 	A program that prompts the user for two integers and 
		 	then print several characteristics of the numbers. 
		 	The characteristics to be printed are:
		 		The sum 
		 		The difference
		 		The product 
		 		The average 
		 		The distance 
		 		The maximum 
		 		The minimum  
		 */
		
	}
}
