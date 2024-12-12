package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	int Age;
	String Name;
	String Breed; 
	
	
	public Dog() {
		Age = 3;
		Name = new String("Clifford");
		Breed = new String("Big red dog");
	}
	
	public Dog(String N) {
		Name = N;
		Age = 1; 
		Breed = new String("dog dog");
		
	}
	
	public Dog(String N, String B) {
		Breed = B;
		Name = N;
		Age = 1;
	}
	
	public Dog(String N, int x) {
		Age = x; 
		Breed = new String("dog dog");
		Name = N;
	}
	
	public void setName(String N){
		Name = N;
	}
	
	public void setAge(int x){
		Age = x;
	}
	
	public void setBreed(String B){
		Breed = B;
	}
	
	public String getName(){
		return Name;
	}
	
	public int getAge(){
		return Age;
	}
	
	public String getBreed(){
		return Breed;
	}
	
	public boolean isSleeping() { 
	return Math.random()<0.5;
}

public void bark() {
	System.out.println("Dog name: " + Name);
	System.out.println("It barks");
//	System.out.println("")
	
	
}

}
