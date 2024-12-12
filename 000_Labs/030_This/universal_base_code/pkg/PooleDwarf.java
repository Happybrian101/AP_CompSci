/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		// Complete this constructor
		this.name = name;
		this.age = age; 
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String name){
		// Fix this method
		System.out.println(name + "was the name with ");
	}
	
	public void setAge(String age){
		// Fix this method
		
	}

	public boolean isSameName(String name){
		// Complete this method
		return name;
	}
}


