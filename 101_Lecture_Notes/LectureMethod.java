/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Spike");
        greeting("Mortis");
        
        double num = raise (2000000.42, 5);
        System.out.println(num);
        num = raise(num+6000, 6);
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	
	public static void greeting(String name){
	    System.out.println("Howdy " + name);
	}
	
	public static void printAnimal(){
	     System.out.println("   /_\\");
	     System.out.println("\\_\\(_)/_/");
	     System.out.println(" _//o\\\\_");
	     System.out.println("   /  \\");
 
	}
}