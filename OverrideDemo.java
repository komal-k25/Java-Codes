package unit2;

public class OverrideDemo {
	int twice(int num) {
		return num*2;
	}
}

public class OverrideDemo2 extends OverrideDemo {

	@Override
	int twice(int num) {
		// TODO Auto-generated method stub
		return (num*3);
	}

	public static void main(String[] args) {
		
		OverrideDemo ord = new OverrideDemo();
		System.out.println(ord.twice(3));      //compile time polymorphism
		
		OverrideDemo2 ord1 = new OverrideDemo2();
		System.out.println(ord1.twice(3));     //compile time polymorphism
		
		ord = ord1;
		System.out.println(ord.twice(3));      //run time polymorphism
	}
} 
