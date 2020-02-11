import java.util.Scanner;
public class SphereVolume 
{ 
public static void main(String[] args) 
{ 
	String output;
	Scanner input = new Scanner(System.in);
	output = "The purpose of this program is to calculate the volume of a sphere.";
	System.out.println(output);
	output = "Enter the diameter of a sphere: ";
	System.out.println(output);
	double diam = input.nextDouble();
	double radius = diam/2;
	double volume = ((double)4/3)* Math.PI*(Math.pow(radius, 3));
	output = "The volume of the sphere is " + volume;
	System.out.println(output);
		
} 
} 
