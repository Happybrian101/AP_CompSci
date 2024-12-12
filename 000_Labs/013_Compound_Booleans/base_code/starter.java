/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner ok = new Scanner(System.in);
		System.out.println("Give me a number");
		int number = ok.nextInt();
		System.out.println("Give me another number");
		int number2 = ok.nextInt();
		System.out.println("Give me another number");
		int number3 = ok.nextInt();
		
		if (number > number2) {
			if (number > number3) { 
				System.out.print(number);
			}
		}
		if (number2 > number) {
			if (number2 != number3) {
				System.out.print(number2);
			}
		}
		if (number3 < number) {
			if (number3 != number2) {
				System.out.print(number3);
			}
		}
	}
}
          
	//else if {
	//	System.out.print("This is not the largest integer");
//	}
//	else {
//		System.out.print("")
	
