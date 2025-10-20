/*
============================================================================
 FILE        : LE23_DecToHex
 AUTHOR      : Failette S. Oledan
 DESCRIPTION : This program converts a user-entered decimal number into its
 				hexadecimal equivalent using manual base conversion logic.
 COPYRIGHT   : September 21, 2025
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
 DESCRIPTION : Prompts the user to enter a decimal number, then converts it to
 				hexadecimal by repeatedly dividing by 16 and mapping remainders
 				to hex degits. Display the final hexadecimal string.

 ARGUMENTS   : String[] args - command-line arguments (not used in this program)

 RETURNS     : (no return) 	void
===========================================================================
*/



import java.util.Scanner;

public class LE23_DecToHex {

	public static void main(String[] args) {
		int decNum, rem;
		String hexToDec = " ";
		char hex[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a decimal number: ");
		decNum = scanner.nextInt();
		
		while(decNum > 0) {
			rem = decNum % 16;
			hexToDec = hex[rem] + hexToDec;
			decNum = decNum / 16;
		}
		
		System.out.println("Hexadecimal number: " + hexToDec + "\n");

	}
	
}
