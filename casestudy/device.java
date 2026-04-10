package casebased2;

//parent
public abstract class Device {
	private String brand;

    Device(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
}


package casebased2;

public class ElectricKettle extends Device{
	public ElectricKettle(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(" Kettle is on.");
    }
}

//interface
public interface RemoteControllable {
	void connectToWifi();
}

//interface
interface PowerSaving {
    String getEnergyRating();
}

public class SmartTV extends Device implements RemoteControllable, PowerSaving {

    public SmartTV(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(" Smart TV is now ON.");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Smart TV connected to WiFi.");
    }

    @Override
    public String getEnergyRating() {
        return "5 Star";
    }
}


//main
public class Main {
    public static void main(String[] args) {

        SmartTV tv = new SmartTV("Samsung");

        Device d = tv; //upcasting
        d.turnOn();

        RemoteControllable rc = tv; 
        rc.connectToWifi();

        PowerSaving ps = tv;
        System.out.println("Energy Rating: " + ps.getEnergyRating());

      
        Device kettle = new ElectricKettle("Philips");
        kettle.turnOn();
    }
}
