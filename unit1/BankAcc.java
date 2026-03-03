package practice;

//Create at least 3 BankAccount objects and Display details of each account & 
//Display total number of accounts created

import java.util.Scanner;

public class BankAcc {
	private int acc_no;
	private String acc_holder_name;
	private double balance;
	private static int total_no_of_accounts;
	
	void setAccno(int acc_no) {
		this.acc_no = acc_no;
	}
	
	void setName(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	int getAccno() {
		return this.acc_no;
	}
	String getAcc_holder_name() {
		return this.acc_holder_name;
	}
	
	double getBalance() {
		return this.balance;
	}
	
	static int getTotal_no_of_accounts() {
		return total_no_of_accounts;
	}
	
	BankAcc( int acc_no, String acc_holder_name, double balance){
		this.acc_no = acc_no;
		this.acc_holder_name = acc_holder_name;
		this.balance = balance;
		total_no_of_accounts++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAcc b1 = new BankAcc(1,"A",30000.00);
		BankAcc b2 = new BankAcc(2,"B",40000.00);
		BankAcc b3 = new BankAcc(3,"C",10000.00);
		
		System.out.println("Total Number of accounts: "+total_no_of_accounts);
		
		System.out.println("Details of Bank Accounts: \n Account number: " + b1.getAccno() + "\n Account Holder name:"
				+ b1.getAcc_holder_name() + "\n Balance: " + b1.getBalance() );
		System.out.println("\n Account number: " + b2.getAccno() + "\n Account Holder name:"
				+ b2.getAcc_holder_name() + "\n Balance: " + b2.getBalance() );
		System.out.println("\n Account number: " + b3.getAccno() + "\n Account Holder name:"
				+ b3.getAcc_holder_name() + "\n Balance: " + b3.getBalance() );
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter account number: ");
		int a = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("\n Enter account name: ");
		String b = sc.nextLine();
		
		System.out.println("\n Enter account balance: ");
		double c = sc.nextDouble();
		
		BankAcc b4 = new BankAcc(a,b,c);
		System.out.println("\n Account number: " + b4.getAccno() + "\n Account Holder name:"
				+ b4.getAcc_holder_name() + "\n Balance: " + b4.getBalance() );
		sc.close();
	}
}
