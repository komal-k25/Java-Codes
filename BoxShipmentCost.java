//parent class - box
package practice.inheritance;

public class box {
	private double height;
	private double width;
	private double length;
	final double PI = 3.14;
	
	//constructor
	box(){
		this.height = -1;
		this.width = -1;
		this.length = -1;
	}

  //parameterized constructor
	box(double height, double width, double length){
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	//copy constructor
	box(box b) {
	    this.length = b.length;
	    this.width = b.width;
	    this.height = b.height;
	}

  //getter & setter methods of all variables of this class
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double volume() {
		return (getHeight()*getWidth()*getLength());
	}
}

//child class - shipmentCost
package practice.inheritance;

public class shipmentCost extends box {
	private double cost;
	
	//constructor
	shipmentCost(){      
		super(); //calls parent constructor
		this.cost = -1;
	}
	
	//parameterized constructor
	shipmentCost(double length, double height, double width, double cost){
		super(length, height, width); //from parent class
		this.cost = cost;
	}
	
	//copy constructor
	shipmentCost(shipmentCost sc){
		super(sc);  //calls the copy constructor of parent class to get that data (parent copy)
		this.cost = sc.cost;  //add own data (child copy)
	}
	
	//getter method
	public double getCost() {
		return cost;
	}
	
	//setter method
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//child method
	public double calcShipCost() {
		return this.volume() * this.cost;
	}
}

//main inheritance demo
package practice.inheritance;

public class inheritanceDemo {
    public static void main(String[] args) {

        shipmentCost c1 = new shipmentCost();
        shipmentCost c2 = new shipmentCost(1, 2, 3, 4);
        shipmentCost c3 = new shipmentCost(c2);

        System.out.println("Volume (c2): " + c2.volume());
        System.out.println("Shipping Cost (c2): " + c2.calcShipCost());

        System.out.println("Volume (c3 - copied): " + c3.volume());
        System.out.println("Shipping Cost (c3 - copied): " + c3.calcShipCost());
    }
}
