package unit2;

public class Calculator1 {
	int add(int num1, int num2) {
		return num1+num2;
	}
	double add(double num1, double num2) {
		return num1+num2;
	}
}
public class Calculator2 extends Calculator1{

	@Override
	int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return (num1+num2)*2;
	}

	@Override
	double add(double num1, double num2) {
		// TODO Auto-generated method stub
		return (num1+num2)*2;
	}
	
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		System.out.println(c1.add(2, 2));
		
		Calculator2 c2 = new Calculator2();
		System.out.println(c2.add(2, 2));
		
		c1 = c2;
		System.out.println(c1.add(2, 2));
	}
}
