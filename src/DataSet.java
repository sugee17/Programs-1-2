/*
 	Susan Gee, Period 3, DataSet.java program
 */

public class DataSet 
{
	
	//default constructor
		public DataSet( )
		{
			smallest = Integer.MAX_VALUE;
			largest = Integer.MIN_VALUE;	
		}
	
	//parameterized constructor
	public DataSet(int aLarge, int aSmall)
	{
		largest = aLarge;
		smallest = aSmall;
	}
	
	//add value method
	public void addValue(int x)
	{
		
		smallest = Math.min(smallest, x);
		
		largest = Math.max(largest, x);
		
	}
	
	
	//get maximum method
	public int getLargest( )
	{
		
		return largest;
	}
	
	//get minimum method
	public int getSmallest( )
	{
		
		return smallest; 
	}
	
	//instance fields
	private int smallest = Integer.MAX_VALUE;
	private int largest = Integer.MIN_VALUE;

	
}
 