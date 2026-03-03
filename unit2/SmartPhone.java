//A smart device supports Callable and Camera. Both have methods. 
//Create a class SmartPhone implementing both interfaces and demonstrate in main method.

public interface Camera {
	void takePic();
}

public interface Callable {
	void makeCall(String number);
}

public class SmartPhone implements Callable, Camera{

	@Override
	public void takePic() {
		System.out.println("Photo clicked!");
		
	}

	@Override
	public void makeCall(String number) {
		System.out.println("Calling number "+number);
		
	}
	
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.makeCall("45712124335");
		phone.takePic();	
	}
}
