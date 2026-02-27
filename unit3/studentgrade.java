package unit3;

public class CheckGrade {
	private int marks;
	
	CheckGrade(){
		this.marks = -1;
	}
	
	CheckGrade(int marks){
		this.marks = marks;
	}
	
	public int getMarks() {
		return marks;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	void validate() throws InvalidMarksException{
		if(this.marks < 0 || this.marks > 100) {
			throw new InvalidMarksException("Inavlid marks entered.");
		}
		else {
			System.out.println("Valid marks entered.");
		}
	}
}



package unit3;

public class InvalidMarksException extends Exception{
	InvalidMarksException(String message){
		super(message);
	}
}



package unit3;

import java.util.Scanner;

public class StudentGradingSystem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grades: ");
		int gr = sc.nextInt();
		CheckGrade g1 = new CheckGrade(gr);
		
		try {
			g1.validate();
		}
		catch(InvalidMarksException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Marks is " + g1.getMarks());
		}
	}

}
