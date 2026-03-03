//A college system has:Person, Teacher, HOD. 
//Each class has its own constructor. 
//Pass name → subject → department using super constructor and display all details.
public class Teacher extends Person{
	
	public String subject;
	
	Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}
}

import java.util.Scanner;
public class HOD extends Teacher{
	
	public String dept;
	
	HOD(String name, String subject, String dept){
		super(name, subject);
		this.dept = dept;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter name: ");
		String a = sc.nextLine();
		System.out.println("\nEnter subject: ");
		String b = sc.nextLine();
		System.out.println("\nEnter dept: ");
		String c = sc.nextLine();
		
		HOD h = new HOD(a,b,c);
		HOD h1 = new HOD("Deepali Vora", "Networks", "CSE");
		
		System.out.println("Name: "+h.name+"\nSub: "+h.subject+"\nDept: "+h.dept);
		System.out.println("Name: "+h1.name+"\nSub: "+h1.subject+"\nDept: "+h1.dept);
		
		sc.close();
	}
}
