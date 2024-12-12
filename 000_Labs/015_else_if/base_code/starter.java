/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		int x = (int)((Math.random()*1000)+1);
		System.out.println("Guess a number between 1 and 1000");
		int y = sc.nextInt();
		
		if (x > y) {
			System.out.print("You are higher");
		}
		else if (x < y) {
			System.out.print("You are lower");
		}
		else {
			System.out.print("You got it");
		}
		
		
	}
}
