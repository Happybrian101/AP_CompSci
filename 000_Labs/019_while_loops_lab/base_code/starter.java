/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
int x = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Give me a name");
String name = sc.nextLine();
System.out.println("How many times would you like to print your name out?");
int o = sc.nextInt();


while(x < o)
{
	if (x == o) { 
		break;
		
	}
	System.out.println(name);
	
	x = x + 1;
}
		
	}
}
