/*
 	Susan Gee , Period 5 , Easter.java program
 */

public class Easter 
{
	//Calculations
	public Easter(int year)
	{
		
		a = year % 19;
		b = year / 100;
		c = year % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4;
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n = (h - m + r + 90) / 25;
		p = (h - m + r + n + 19) % 32;	
	}
	
	//Gets the month of Easter Sunday
	public int getMonth( )
	{
		return n;
	}
	
	//Gets the date of Easter Sunday
	public int getDay( )
	{
		return p;
	}
	
	//Get first letter
	public int getFirstLetter()
	{
		return (n * 9) - 9;
	}
	
	//Gets last letter
	public int getLastLetter( )
	{
		return (n * 9);
	}
	
	//Get the month name
	public String getMonthName( )
	{
		return ALL_THE_MONTHS.substring(getFirstLetter( ), getLastLetter());
	}
	
	private static final String ALL_THE_MONTHS = 
										"January  "
									  + "February "
									  + "March    "
									  + "April    "
									  + "May      "
									  + "June     "
									  + "July     "
									  + "August   "
									  + "September"
									  + "October  "
									  + "November "
									  + "December ";
	
	//instance fields
	private int a;
	private int b;
	private int c; 
	private int d;
	private int e;
	private int g;
	private int h;
	private int j;
	private int k;
	private int m;
	private int r;
	private int n;
	private int p;
}