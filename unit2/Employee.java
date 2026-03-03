package prep;
public class Employee {
	public String name;
	public int salary;
	Employee(){
		name = "NA";
		salary = -1;
	}
	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	//getter and setter methods
	void setName(String name) {
		this.name = name;
	}
	void setSalary(int salary) {
		this.salary = salary;
	}
	String getName() {
		return this.name;
	}
	int getSalary() {
		return this.salary;
	}
	//calculate salary method
	int calcSalary() {
		return this.salary;
	}
}
package prep;

public class Manager extends Employee{
	public int bonus;
	Manager(String name, int salary, int bonus){
		super(name, salary);
		this.bonus = bonus;
	}
	@Override
	int calcSalary() {
		// TODO Auto-generated method stub
		return super.calcSalary()+bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager("Komal", 1000000, 40000);
		System.out.println("Name: "+m.name + "\nSalary: "+m.calcSalary());
	}

}

