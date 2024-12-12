/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Give a number");
		int number = sc.nextInt();
		System.out.println("Give another number");
		int number2 = sc.nextInt();
		
	if (number == number2) {
		System.out.print("These two numbers are equal to each other.");	
	}
		
	if (number != number2) {
		System.out.print("These two numbers are not equal to each other");
	}
	}
}
