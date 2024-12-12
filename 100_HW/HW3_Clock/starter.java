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
		
		System.out.println("What day is it 0-6?");
		int day = sc.nextInt();
		
		
		if ((day >= 1) && (day <= 5)) {
			System.out.println("Wake up its a Weekday! 7AM");
		}
		else if ((day == 6) && (day <= 6)) {
			System.out.println("Wake up its the Weekend! 10AM");
		}
		else {
			System.out.println("Invalid input put something else");
		}
		}
}
