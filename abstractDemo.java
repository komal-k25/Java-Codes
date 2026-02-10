package practice;

public abstract class Vehicle {
	private String vehicle_num;
	private String fuel_type;
	
	//parameterized constructor
	public Vehicle(String vehicle_num, String fuel_type){
		this.vehicle_num = vehicle_num;
		this.fuel_type = fuel_type;
	}
	
	//constructor 
	public Vehicle(){
		this.vehicle_num = "NA";
		this.fuel_type = "NA";
	}
	
	public void startVehicle(){
		System.out.println("Vehicle has started");
	}
	
	public String getVehicle_num() {
		return vehicle_num;
	}
	
	public void setVehicle_num(String vehicle_num) {
		this.vehicle_num = vehicle_num;
	}
	
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	
	public double mileage(double km, double ltr) {
		double mil = km/ltr;
		return mil;
	}
}

package practice;

public class Car extends Vehicle{
	private double load;
	
	//constructor
	Car(){
		super(); 
		this.load = -1;
	}
	
	//parameterized constructor
	Car(String vehicle_num, String fuel_type, double load){
		super(vehicle_num, fuel_type);
		this.load = load;
	}
	
	@Override
	public double mileage(double km, double ltr) {
		// TODO Auto-generated method stub
		return super.mileage(km, ltr);
	}
	@Override
	public void startVehicle() {
		// TODO Auto-generated method stub
		super.startVehicle();
	}
}

public class AbstractDemo {
    public static void main(String[] args) {

        Vehicle v = new Car("MH629425707", "CNG", 300);

        v.startVehicle();
        System.out.println("Mileage is " + v.mileage(500, 300));
    }
}

