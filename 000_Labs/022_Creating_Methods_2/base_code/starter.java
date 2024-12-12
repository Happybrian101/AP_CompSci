/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int x = sc.nextInt();
		System.out.println("What is your exponent number?");
		int y = sc.nextInt();
		
		
		System.out.println("Your answer is: " + pow(x,y));
	
}

	public static int pow(int x, int y){
		int result = x;
		int counter = 1; 
		if (x != 0 && y == 0) {
				return 1;
			}
	else if(x == 0 && y == 0) {
		return 0;
	}
		while(counter < y){ 
		
			counter = counter+1;
				result = result * x; 
		}
		
	
		return result;
	}

	}
