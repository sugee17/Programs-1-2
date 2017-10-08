/*
 	Susan Gee , Period 5 , Circle.java program 
 */

public class Circle 
{
	//default constructor
	public Circle( )
	{
		radius = 0;
	}
	
	//parameterized constructor
	public Circle(double aradii)
	{
		radius = aradii;
	}
	
	//solve for area of circle
	public double getArea( )
	{
		return Math.PI * radius;
	}
	
	//solve for circumference of circle
	public double getCircumference( )
	{
		return 2 * Math.PI * radius;
	}
	
	//instance fields
	private double radius;
}
