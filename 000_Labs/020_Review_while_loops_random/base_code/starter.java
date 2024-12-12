/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
Scanner sc = new Scanner(System.in);
int x = (int)((Math.random()*1000)+1);
System.out.println("Guess a number");
int y = sc.nextInt();


while (x != y){
	
	 if (x > y) {
		System.out.println("You are lower!");
		System.out.println("Keep guessing.");
		y = sc.nextInt();
	}
	else {
		System.out.println("You are higher!");
		System.out.println("Keep guessing");
		y = sc.nextInt();
	}
	if (x == y) {
		System.out.println("You won!");
		break;
	}
	x = x + 1;
}


		
	}
}
