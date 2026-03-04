public interface BankInterface {
	int rate = 10;  //public static final by default
}
public class SBI implements BankInterface{
	void display() {
		System.out.println("Bank rate is: "+rate);
	}
	void changeRate() {
		rate = 15; //compile time error as variable is public static final by default
	}
	public static void main(String[] args) {
		SBI a = new SBI();
		a.display();
		a.changeRate();
	}
}
