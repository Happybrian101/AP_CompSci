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
		int x = (int)((Math.random()*20)+1);
		int y;
		y = 20;
		System.out.println("What is your name");
		String name = sc.nextLine();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String traits = sc.nextLine();
		
		if (traits.equals("Wizard") || traits.equals("wizard")) {
			System.out.println("You chose to be a Wizard.");
		}
		else if (traits.equals("Warrior") || traits.equals("warrior")) {
			System.out.println("You chose to be a Warrior.");
		}
		else if (traits.equals("Rogue") || traits.equals("rogue")) {
			System.out.println("You chose to be a Rogue");
		}
		else {
			System.out.println("You didn't enter in any of the options. Rerun the program.");
		}
		
	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
	
	System.out.println("Strength (1-10)");
	int strong = sc.nextInt();
	if (strong > 10) {
		System.out.println("Please put in a smaller nubmer");
		strong = sc.nextInt();
	}
	else if (y-strong <= 0) {
		System.out.println("Please put in a smaller number");
		strong = sc.nextInt();
	}
	
	y = y - strong;
	System.out.println("You have " + y + " left");
	
	System.out.println("Dexterity (1-10)");
	int flex = sc.nextInt();
	if (flex > 10) {
		System.out.println("Please put in a smaller number");
		flex = sc.nextInt();
	}
	else if (y-flex <= 0) {
		System.out.println("Please put in a smaller number");
		flex = sc.nextInt();
	}
	
	y = y - flex;
	System.out.println("You have " + y + " left");
	
	System.out.println("Intelligence (1-10)");
	int smart = sc.nextInt();
	if (smart > 10) {
		System.out.println("Please put in a smaller number");
		smart = sc.nextInt();
	}
	else if (y-smart <= 0) {
		System.out.println("Please put in a smaller number");
		smart = sc.nextInt();
	}
	
	y = y - smart;
	System.out.println("You have " + y + " left");
	
	System.out.println("Charisma (1-10)"); 
	int z = sc.nextInt();
	if (z > 10) {
		System.out.println("Please put in a smaller number");
		z = sc.nextInt();
	}
	else if (y-z <= 0) {
		System.out.println("Please put in a smaller number");
		z = sc.nextInt();
	}
	
	y = y - z;
	System.out.println("You have " + y + " left");
	System.out.println("You are " + name + ", the " + title + " of CVHS");
	System.out.println("You're a " + title + " with the following stats");
	System.out.println("Strength - " + strong);
	System.out.println("Dexterity - " + flex);
	System.out.println("Intelligence - " + smart);
	System.out.println("Charisma - " + z);
	System.out.println("Good luck on your quest " + name);
	
	}
}
