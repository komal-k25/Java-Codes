package unit2;

public class OverLoadDemo {
	private int num1;
	private int num2;
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	
	int add(int num) {
		return num+num;
	}
	
	void add(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println(this.num1);
		System.out.println(this.num2);
	}
	
	public static void main(String[] args) {
		OverLoadDemo old = new OverLoadDemo();
		System.out.println(old.add(10));
		System.out.println(old.add(20,10));
		old.add(10,20,30);
	}
}
