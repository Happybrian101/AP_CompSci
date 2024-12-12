/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a word or phrase");
	String x = sc.nextLine();
	
	while(true){
		if(x.indexOf(" ") == -1){
			System.out.print(spongecase(x));
			break;
		}
		int space = x.indexOf(" ");
		String word = x.substring(0,  space);
		System.out.print(spongecase(word) + " ");
		x = x.substring(space + 1);
	}
	
	}
	
	public static String spongecase(String word){
		String y = "";
	
		for(int i = 0; i < word.length(); i++){
		String l = word.substring(i, i+1);
		
		if(i % 2 == 0){
			l = l.toLowerCase();
		}
		else{
			l = l.toUpperCase();
		}
		y = y + l;
	
	}
	return y;
	


	}
}


