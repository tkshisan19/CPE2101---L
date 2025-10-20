/*
============================================================================
 FILE        : LE13_ChocolateBars
 AUTHOR      : Failette S. Oledan
 DESCRIPTION : This program calculates the Basal Metabolic Rate (BMR) for both
               women and men based on user input (weight, height, age), and
               estimates the number of chocolate bars needed to maintain that BMR.

 COPYRIGHT   : September 17, 2025
 REVISION HISTORY
 Date:               By: 	        Description:
 revision date	    author         description of the change
 revision date	    author         description of the change
 .
 .
 .
 revision date	    author         description of the change
============================================================================
*/



 /*
============================================================================
 FUNCTION    : main
 DESCRIPTION : Prompts the user for weight (lbs), height (inches), and age (years),
               then calculates and displays BMR for both women and men using standard
               formulas. It also computes how many 230-calorie chocolate bars are
               needed to maintain that BMR.



 ARGUMENTS   : String[] args - command-line arguments (not used in this program)

 RETURNS     : (no return) 	void
===========================================================================
*/



import java.util.Scanner;

public class LE13_ChocolateBars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	
		//get weight, height, and age from the user
		double weight, height, age, BMR;
		System.out.println("Enter weight in pounds: ");
		weight = scanner.nextDouble();
		
		System.out.println("Enter height in inches: ");
		height = scanner.nextDouble();
		
		System.out.println("Enter age in years: ");
		age = scanner.nextDouble();
		
		
		
		//Calculation
		BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		System.out.println("\nIf you're a woman then your BMR is "+ Math.round(BMR*100.0)/100.0);
		System.out.println("The number of chocolate bars that you should be consumed to maintain your weight is "+ Math.round((BMR/230)*100.0)/100);
		
		
		BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		System.out.println("\nIf you're a man then your BMR is "+ Math.round(BMR*100.0)/100.0);
		System.out.println("The number of chocolate bars that you should be consumed to maintain your weight is "+ Math.round((BMR/230)*100.0)/100);
		

	}

}
