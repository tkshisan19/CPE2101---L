/*
============================================================================
 FILE        : LE14_DistanceBetweenTwoPoints
 AUTHOR      : Failette S. Oledan
 DESCRIPTION : This program calculates the Euclidean distance between two points
               in a 2D plane using the distance formula.


 COPYRIGHT   : September 18, 2025
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
 DESCRIPTION :  Prompts the user to input coordinates for two points (x1, y1) and
               (x2, y2), then calculates and displays the distance between them
               using the formula √[(x2 - x1)² + (y2 - y1)²].

 ARGUMENTS   : String[] args - command-line arguments (not used in this program)

 RETURNS     : (no return) 	void
===========================================================================
*/



import java.util.Scanner;

public class LE14_DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x1 and y1: ");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		double distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
		
		System.out.println("The distance between the tow points is " + distance);
		

	}

}
