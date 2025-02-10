package GSLC_OOP_2_interface;

interface Shape {
	double area();
	double volume();
}

class Rectangle implements Shape{
	int length;
	int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}
	
	public double volume() {
		return 0;
	}
}

class Circle implements Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return 3.14 * radius;
	}
	
	public double volume() {
		return 0;
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(5, 2);
		Circle circle1 = new Circle(10);
		
		System.out.println("Area of rectangle: " + rectangle1.area());
		System.out.println("Area of circle: " + circle1.area());
		
		System.out.println("Volume of rectangle: " + rectangle1.volume());
		System.out.println("Volume of circle: " + circle1.volume());
	}
}