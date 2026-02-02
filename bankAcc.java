package unit1;

public class BankAccount {

	private int acc_no;

	private String name;

	private double balance;

	private static int totalAccount;

	BankAccount(int acc_no, String name, double balance){

		this.acc_no = acc_no;

		this.name = name;

		this.balance = balance;		

		totalAccount++;

	}

	String getName() {

		return this.name;

	}

	void setName(String name) {

		this.name = name;

	}

	int getAccNo() {

		return this.acc_no;

	}

	void setAccNo(int acc_no) {

		this.acc_no = acc_no;

	}


	static int getTotalAmt() {

		return totalAmount;

	}

}

//main method calling
package unit1;

public class asignment {

	public static void main(String[] arg) {

		BankAccount bt1 = new BankAccount(1,"First",100);

		BankAccount bt2 = new BankAccount(2,"Second",200);

		BankAccount bt3 = new BankAccount(3,"Third",300);

		System.out.println("Name of account 1",+bt1.getName)

	}

}
