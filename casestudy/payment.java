package casestudy;

public abstract class payment {
	private int transactionId;
	private int amount;
	
	payment(){
		this.transactionId = -1;
		this.amount = -1;
	}
	
	payment(int transactionId, int amount){
		this.transactionId = transactionId;
		this.amount = amount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	void processPayment() {
		
	}
}


package casestudy;

public class CreditCardPayment extends payment{
	private double fee;
	
	CreditCardPayment(){
		super();
		this.fee = -1;
	}
	
	CreditCardPayment(int transactionId, int amount){
		super(transactionId, amount);
	}

	@Override
	void processPayment() {
		// TODO Auto-generated method stub
		super.processPayment();
		double fee = getAmount() * 0.02; 
        double total = getAmount() + fee;

        System.out.println("Processing Credit Card Payment");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Amount: " + getAmount());
        System.out.println("Convenience Fee (2%): " + fee);
        System.out.println("Total Amount Charged: " + total);
	}
	
}


package casestudy;

public class UPIPayment extends payment {
    private String upiId;

    public UPIPayment(int transactionId, int amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        if (upiId == null) {
            System.out.println("Invalid UPI ID. Payment failed.");
            return;
        }

        System.out.println("Processing UPI Payment");
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println("Amount: " + getAmount());
        System.out.println("UPI ID: " + upiId);
        System.out.println("No additional charges.");
    }
}

package casestudy;

public class PaymentProcessor {
	public void process(payment payment) {
        payment.processPayment(); 
        System.out.println("--------");
    }
}

package casestudy;

public class main {
	public static void main(String[] args) {

        payment p1 = new CreditCardPayment(1001, 1000);
        payment p2 = new UPIPayment(1002, 1000, "komal@upi");

        PaymentProcessor processor = new PaymentProcessor();

        processor.process(p1); 
        processor.process(p2); 
    }
}
