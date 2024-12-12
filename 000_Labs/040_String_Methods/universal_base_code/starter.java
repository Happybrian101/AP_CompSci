/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a first and last name with a space in the middle.");
	String x = sc.nextLine();
	//String Space1 =
	int w = x.indexOf(" ");
	String Space = x.substring(w+1);
	
	System.out.println(Space);
	
	
	}
}
