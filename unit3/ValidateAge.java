//check ages using exceptions for voting 

public class InvalidAgeException extends Exception{  //user-defined exception
	InvalidAgeException(String msg){
		super(msg);  //from Exception class
	}	
}

public class NegativeAgeException extends Exception{  //user-defined exception
	NegativeAgeException(String message) {
		super(message);
	}
}

import java.util.InputMismatchException;
public class AgeCheck {
	
	private int age;
	
	AgeCheck(){
		this.age = -1;
	}
	
	AgeCheck(int age){
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	void validate() throws InputMismatchException,NegativeAgeException,InvalidAgeException{
		
		if(this.age<0) {
			throw new NegativeAgeException("Age cant be -ve");
		}
		
		else if(this.age>0 && this.age<18) {
			System.out.println("You are not eligible to vote.");
		}
		
		else if(this.age>60) {
			throw new InvalidAgeException("Overage");
		}
		
		else {
			System.out.println("You are eligible to vote.");
		}
	}
}

package unit3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAge {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int a = sc.nextInt();
		
		AgeCheck a1 = new AgeCheck(a);
		
		try {
			a1.validate();
			System.out.println("Yay you can cast vote.");
		}
		
		catch(NegativeAgeException e){
			System.out.println(e.getMessage());  //can also print from this
		}
		
		catch(InvalidAgeException e){
			System.out.println("Sorry you are over aged to cast vote.");  // or e.getMessage()
		}
		
		finally {    //will always run
			System.out.println("Age is " + a1.getAge());
		}
	}
}
