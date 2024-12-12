/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence.");
		String sentence = sc.nextLine();
		
		//String word = "";
		String newSentence = "";

		while(true){
			if (sentence.indexOf(" ") == -1){
				sentence = toPigLatin(sentence);
				break;
			}
			int x = sentence.indexOf(" ");
			String f = sentence.substring(0, x);
			sentence = sentence.substring(x+1);
            f = toPigLatin(f);
            newSentence = newSentence+f;
			
		}
		System.out.println(newSentence);
	}
	
	public static String toPigLatin(String word){
		String y = word.substring(0,1); // 1st letter
		String z = word.substring(1,2); // 2nd letter
		if(y.equals("a") || y.equals("e") || y.equals("i") || y.equals("o") || y.equals("u") || y.equals("A") || y.equals("E") || y.equals("I") || y.equals("O") || y.equals("U")){
			word = word + "-way";
		}
		else if(!(y.equals("a") || !(y.equals("e")) || !(y.equals("i")) || !(y.equals("o")) || !(y.equals("u")) || !(y.equals("A")) || !(y.equals("E")) || !(y.equals("I")) || !(y.equals("O")) || !(y.equals("U"))) && z.equals("a") || z.equals("e") || z.equals("i") || z.equals("o") || z.equals("u") || z.equals("A") || z.equals("E") || z.equals("I") || z.equals("O") || z.equals("U")){
			word = word.substring(1)+"-" + y + "ay";
		}
		else{
			word = word.substring(2)+"-"+y+z+"ay";
		}
		return word;
	}
}

