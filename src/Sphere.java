/*
 	Susan Gee , Period 5 , Sphere.java program
 */

public class Sphere 
{
	//default constructor
	public Sphere( )
	{
		radius = 0;
	}
	
	//parameterized constructor
	public Sphere(double aradii)
	{
		radius = aradii;
	}
	
	//solve for volume of sphere
	public double getVolume( )
	{
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	//solve for surface area of sphere
	public double getSurfaceArea( )
	{
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	//instance fields
	private double radius;
}
