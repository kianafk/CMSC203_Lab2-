/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
//		int score1 = 100; // first test score
//		int score2 = 95; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		
		
		System.out.println("Enter score 1: ");
		int score1 = input.nextInt(); 
		System.out.println("Enter score 2: ");
		int score2 = input.nextInt(); 
		average = ((double)score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
		fToC = ((double)5/9) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		
		System.out.println("Input another Temperature: ");
		int userTemp = input.nextInt(); 
		fToC = ((double)5/9) * (userTemp - 32);
		output = userTemp + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}
