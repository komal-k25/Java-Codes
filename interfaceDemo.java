package unit2;

public interface Interface1 {
	void readDetails();
}

public interface Interface2 {
	final String DEPT = "CSE";
	void showDetails();
}

public interface Interface3 extends Interface2{
	final String NAME = "SY-A";
	void showDet();
}

public class MainDemo implements Interface3{
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Interface 2 method");
		System.out.println(DEPT);
	}

	@Override
	public void showDet() {
		// TODO Auto-generated method stub
		System.out.println("Interface 3 method");
		System.out.println(NAME);
	}	
}
