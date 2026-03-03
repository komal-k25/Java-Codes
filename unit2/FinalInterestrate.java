//In a banking system, interest rate must not be changed. 
//Create a final variable for rate. Create a final method displayRate(). 
//Try to override it in a subclass and show compile-time error.

public class Bank {
	final double interest_rate = 5.4;
	final void display_rate() {
		System.out.println("Interest rate is" + interest_rate);
	}
}
public class BankSub extends Bank{
	void display_rate() {
		System.out.println("Rate is refreshed...");
	}
	public static void main(String[] args) {
		BankSub a = new BankSub();
		a.display();
	}
}
