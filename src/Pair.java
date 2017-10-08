/*
 	Susan Gee, Period 5, Pair.java program
 */

public class Pair 
{
	//default constructor
	public Pair( )
	{
		numeroUno = 0;
		numeroDos = 0;
	}
	
	//constructor to accept two integers 
	public Pair(int aFirst, int aSecond)
	{
		numeroUno = aFirst;
		numeroDos = aSecond;
	}
	
	//returns First int
	public int numFirst(int aFirst)
	{
		return numeroUno;
	}
	
	//returns Second int
	public int numSecond(int aSecond)
	{
		return numeroDos;
	}
	
	//get sum method
	public double getSum( )
	{
		return numeroUno + numeroDos;
	}
	
	//get difference method
	public double getDifference( )
	{
		return numeroDos - numeroUno;
	}
	
	//get product method
	public double getProduct( )
	{
		return numeroUno * numeroDos;
	}
	
	//get average method
	public double getAverage( )
	{
		return this.getSum() / 2;
	}
	
	//get distance method
	public double getDistance( )
	{
		return Math.sqrt(numeroUno * numeroUno + numeroDos * numeroDos);
	}
	
	//get maximum method
	public int getMaximum( )
	{
		return Math.max(numeroUno, numeroDos);
	}
	
	//get minimum method
	public int getMinimum( )
	{
		return Math.min(numeroUno, numeroDos);
	}
	
	//instance fields
	private int numeroUno;
	private int numeroDos;

	
}
