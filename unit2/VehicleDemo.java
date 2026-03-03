//Create an abstract class Vehicle with abstract method fuelType().
//Implement Car and Bike.
//Call methods using base class reference. 

public abstract class Vehicle {
	abstract void fuelType();
}

public class Car extends Vehicle{
	void fuelType() {
		System.out.println("Car uses petrol or diesel.");
	}
}

public class Bike extends Vehicle{
	void fuelType() {
		System.out.println("Bike uses petrol.");
	}
}

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle v = new Car();  
		v.fuelType();
		
		v = new Bike();
		v.fuelType();
	}
}
