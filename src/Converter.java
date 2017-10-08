/*
 	Susan Gee, Period 5, Converter.java program
 */

public class Converter 
{
	
	//Constructs a converter that can convert between two units
	public Converter(double aConversionFactor)			
	{
		factor = aConversionFactor;
	}
	
	//Constructs from a source measurement to a target measurement
	public double convertTo(double fromMeasurement)
	{
		numberConversion = fromMeasurement;
		return numberConversion / factor;
	}
	
	
	//instance fields
	private double factor;
	private double numberConversion;
	
}
