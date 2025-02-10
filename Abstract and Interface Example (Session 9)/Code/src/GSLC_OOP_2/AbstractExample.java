package GSLC_OOP_2;

abstract class Shape {
	abstract double area();
}

class Rectangle extends Shape{
	int length;
	int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	double area() {
		return length * width;
	}
}

class Circle extends Shape{
	int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	double area() {
		return 3.14 * radius;
	}
}

public class AbstractExample {
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(5, 2);
		Circle circle1 = new Circle(10);
		
		System.out.println("Area of rectangle: " + rectangle1.area());
		System.out.println("Area of circle: " + circle1.area());
	}
}