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
			int rands = (int)(Math.random()*150)+51;
			int [] arr = new int[rands];
		
		for(int x = 0; x < arr.length; x++){
			arr[x]=(int)(Math.random()*100)+1;
		}
		
		//int x = 0; 
		int length = arr.length;
		int y = 0;
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]<min){
				
				min = arr[i];
			}
		}
		System.out.println("The minimum of 1000 random numbers is: " + min);
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("The maximum of 1000 random numbers is: " + max);
		
		int u = 0;
		for(int m = 0; m<arr.length; m++)	{
		u = u + arr[m];
		
		}
		int AVG = (u * 1/arr.length);
		
		System.out.println("The average of 1000 random numbers is: " + AVG);
	//	y = (int)(Math.random()*1000);
		int size = arr.length;
		int elements = arr.length;
		
		System.out.println("There are " + elements + " elements.");
		


		
	}
}
