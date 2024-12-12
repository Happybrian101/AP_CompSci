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
		String W = new String("Wizard");
		String War = new String("Warrior");
		String R = new String("Rogue");
		System.out.println("Do you want to be a Wizard, Warrior, or a Rogue");
		String man = sc.nextLine();
		
		if (man.equals("Wizard") || man.equals("wizard")) {
		System.out.println(W.equals("Wizard"));
		System.out.println(W.equals("wizard"));
		}
			
		else if (man.equals("Warrior") || man.equals("warrior")) {
				System.out.print(War.equals("warrior"));
		}
		else if (man.equals("Rogue")) {
			System.out.print(R.equals("Rogue"));
		}
		else if (man.equals("rogue")) {
				System.out.print(R.equals("rogue"));
		}
		else {
			System.out.print("You didn't put in any of the options. Rerun the program");;
		}
	}
}