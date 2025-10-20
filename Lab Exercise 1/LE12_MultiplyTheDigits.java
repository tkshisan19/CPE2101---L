/*
============================================================================
 FILE        : LE12_MultiplyTheDigits
 AUTHOR      : Failette S. Oledan
 DESCRIPTION : This program prompts the user to enter a number between 0 and 1000,
               then extracts each digit and calculates the product of all digits.
 COPYRIGHT   : September 16, 2025
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
 DESCRIPTION : Validates user input (0–1000), extracts each digit using powers 
 				of 10, prints each digit, and calculates the product of all digits.


 ARGUMENTS   : String[] args - command-line arguments (not used in this program)

 RETURNS     : (no return) 	void
===========================================================================
*/



import java.util.Scanner;


public class LE12_MultiplyTheDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long digits = 0, separate = 0;
		int power = 0, product = 1;
		boolean x = false;
		
		//validation
		while(!x) {
			System.out.println("Enter a number between 0 and 1000: ");
			digits = scanner.nextLong();
			
			if(digits <= 1000 && digits >= 0) {
				x = true;
			}
		}
		
		
		//how many powers of 10 needed
		for(separate = digits; separate / 10 != 0; power++)
		{
			separate = separate / 10;
		}
		
		
		//to print each digits and multiply all
		for(separate = digits; power >= 0; power--)
		{
			System.out.println((int)(separate / Math.pow(10,power)));
			product *= (int)(separate / Math.pow(10,power));
			separate = (long)(separate % Math.pow(10,power));
		}
		
		System.out.println("The product of all digits in " +digits + " is " +product);
		

	}

}
