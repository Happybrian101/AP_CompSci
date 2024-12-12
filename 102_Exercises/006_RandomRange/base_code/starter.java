/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a integer");
		int small = sc.nextInt();
		System.out.println("Please give me a bigger integer(Bigger than the first)");
		int big = sc.nextInt();
		
		
	
		int x = (int) (Math.random() * (big - small));
		
		System.out.println("Your range is " + small + "to " + big);
		System.out.println("Here are 5 numbers generated in that range");
		System.out.println((int(Math.random()*(big - small))+small)));
		
	}
}
