/*
============================================================================
 FILE        : LE22_SimulationHeadOrTails
 AUTHOR      : Failette S. Oledan
 DESCRIPTION : This program simulates flipping a coin two million times using
 				random number generation. It counts and displays the number of
 				heads and tails.
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
 DESCRIPTION : Simulates two million coin flips using Math.random(). Each
 				flip is counted as either heads or tails, and the final
 				totals are printed to the console.

 ARGUMENTS   : String[] args - command-line arguments (not used in this program)

 RETURNS     : (no return) 	void
===========================================================================
*/




public class LE22_SimulationHeadOrTails {

	public static void main(String[] args) {
		int head = 0;
		int tail = 0;
		
		for(int i = 0; i < 2000000; i++) {
			int flip = (int) (Math.random() * 2);
			if(flip == 1) {
				head++;
			} else {
				tail++;
			}
		}
		
		System.out.println("Heads: " +head);
		System.out.println("Tails: " +tail);

	}

}
