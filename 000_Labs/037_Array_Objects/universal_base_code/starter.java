/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard [] Wizards = new Wizard[100];
		Warrior [] Warriors = new Warrior[100];
		
		for(int i = 0; i < 100; i++){
			Wizards[i] = new Wizard();
			Warriors[i] = new Warrior();
		}
		
		int warr = 0;
		int w = 0;
		
		while(true) {
			if(warr < 100 && w < 100){
				Wizards[w].attack(Warriors[warr]);
				if(Warriors[warr].isDead() == true){
					warr++;
				}
				
				if(warr >= 100){
			System.out.println("Wizards won with " + (100-w) + " left in their army. ");
			break;
		}
				Warriors[warr].attack(Wizards[w]);
				if(Wizards[w].isDead() == true){
					w++;
				}
			}
				if(w >= 100){
				System.out.println("Warriors won with " + (100-warr) + " left in their army. ");
				break;
		}
		}
	

	}
}
