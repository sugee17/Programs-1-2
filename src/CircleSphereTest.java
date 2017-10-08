import javax.swing.JOptionPane;

/*
 	Susan Gee , Period 5 , CircleSphereTest.java program 
 */

public class CircleSphereTest 
{
	public static void main(String [ ] args)
	{
		String input = JOptionPane.showInputDialog("Enter a radius: ");				//display input dialog
		int radiusValue = Integer.parseInt(input);
		
		Circle getCircle = new Circle(radiusValue);
		Sphere getSphere = new Sphere(radiusValue);
		
		System.out.println("Radius = " + radiusValue);								//print the values
		System.out.println("Circle :");
		System.out.println("Area = " + getCircle.getArea());
		System.out.println("Circumference = " + getCircle.getCircumference());
		System.out.println("Sphere :");
		System.out.println("Volume = " + getSphere.getVolume());
		System.out.println("Surface Area = " + getSphere.getSurfaceArea());
		
		System.exit(0);
		
		/*
		 	A program that prompts the user for a radius and prints
		 		- the area and circumference of a circle with that radius
		 		- the volume and surface area of the sphere with that radius
		 */
	}
}
