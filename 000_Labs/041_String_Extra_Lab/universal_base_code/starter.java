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
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a sentence: ");
	String sentence = sc.nextLine();
	
	int num = sentence.indexOf(" ");
	String word = sentence.substring(0, num);
	int num1 = sentence.indexOf(" ", num+1);
	String word1 = sentence.substring(num+1, num1);
	
	String opp = "";

		while(true){
		if(sentence.indexOf(" ") == -1){
		//	System.out.println(sentence);
		opp = sentence + opp;
			break;
			}
		int space = sentence.indexOf(" ");
		String sub = sentence.substring(0, space);
		opp = sub + opp;  
		//System.out.println(opp);
		sentence = sentence.substring(space+1);
		}
		System.out.println(opp);
	}
}
