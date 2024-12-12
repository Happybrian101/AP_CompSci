/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
int [] arr = new int [1000];
int x = 0;
int y = 0;

while(x < 1000){
	y = (int)(Math.random()*1000);
	arr[x] = y;
	System.out.println(arr[x]);
	x++; 
}

		
	}
}
