//Create a base class Shape with method draw(). 
//Create Circle, Rectangle, Triangle. 
//Store them in a Shape reference array and call draw() to show runtime binding.
public class Shape {
	void draw() {
		System.out.println("Drawing a shape!");
	}
}
public class Circle extends Shape{
	void draw() {
		System.out.println("Drawing a circle!");
	}
}
public class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing a rectangle!");
	}
}
public class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing a triangle!");
	}
}
public class ShapesDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[4]; //array
		shapes[0] = new Circle();
		shapes[1] = new Rectangle();
		shapes[2] = new Triangle();
		shapes[3] = new Shape();
		
		for(Shape s : shapes) {
			s.draw();
		}
	}
}
