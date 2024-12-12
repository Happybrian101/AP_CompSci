/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
Dog doge = new Dog("Peggy", 5);
Dog bob = new Dog("Bob", "Dog");

boolean sleep = doge.isSleeping();
boolean sleep2 = bob.isSleeping();
if(sleep == true) {
	System.out.println("The dog is slepping right now.");
}

else {
	doge.bark();
}

if(sleep2 == true && sleep == true) {
	System.out.println("The dog is sleeping right now.");
	bob.isSleeping();
	//System.out.println("Bark");
	bob.bark();
	
}
else {
	System.out.println("The first dog is awake and so is the second Dog.");
	bob.bark();
}
//else if() {
	//System.out.println("");
//}

	}
}
