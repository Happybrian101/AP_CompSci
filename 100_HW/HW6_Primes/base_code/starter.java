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
		System.out.println("Give a number.");
		int y = sc.nextInt();
		printprimes(y);
		
		
		
	}
	public static boolean isprime(int x) {
		int i = x-1;
		while(i > 1) {
			if (x%i == 0) {
				return false;
		}
		i--;
	
	}
		return true;
}
	public static void printprimes(int x) {
	int i = x;
	
		while(i > 0) {
			if (isprime(i)) {
				System.out.println(i);
			}
			i--;
		}
	}
}