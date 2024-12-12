/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.employeeToString(); 
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Pam.employeeToString();
		Employee Joe = new Employee(1234, "Joe", "Joe", 100000124.124);
		Joe.employeeToString();
		
		michael.raiseSalary(40);
		System.out.println(michael.getSalary());
		Dwight.raiseSalary(40);
		System.out.println(Dwight.getSalary());
		Jim.raiseSalary(20);
		System.out.println(Jim.getAnnualSalary());
		Pam.raiseSalary(10);
		System.out.println(Pam.getAnnualSalary());
		Joe.raiseSalary(90);
		System.out.println(Joe.getSalary());
		
		
		
		
	}
}
