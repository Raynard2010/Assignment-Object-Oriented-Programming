package areaCalculator;

import java.util.Scanner;

abstract class Shape{
	abstract public double area();
}

class Rectangle extends Shape{
	double p, l;
	
	public Rectangle(double p, double l) {
		this.p = p;
		this.l = l;
	}
	
	public double area() {
		return p * l;
	}
}

class Triangle extends Shape{
	double p, t;
	
	public Triangle(double p, double t) {
		this.p = p;
		this.t = t;
	}
	
	public double area() {
		return 0.5 * p * t;
	}
}

public class AreaCalculator {
	Scanner input = new Scanner(System.in);

	public void areaRectangle() {
		System.out.print("Input panjang: ");
		double p = input.nextDouble();
		System.out.print("Input lebar: ");
		double l = input.nextDouble();	
		
		Rectangle r = new Rectangle(p, l);
		System.out.println("Area of rectangle is " + r.area());
	}
	
	public void areaTriangle() {
		System.out.print("Input panjang: ");
		double p = input.nextDouble();
		System.out.print("Input tinggi: ");
		double t = input.nextDouble();	
		
		Triangle tri = new Triangle(p, t);
		System.out.println("Area of triangle is " + tri.area());
	}

	public static void main(String[] args) {
		AreaCalculator calculator = new AreaCalculator();
		
		int nchoice = 0;
		
		while(nchoice != 3) {
			System.out.println("Choose shape:");
			System.out.println("1. Rectangle");
			System.out.println("2. Triangle");
			System.out.println("3. Exit");	
			System.out.print("Your choice: ");
			
			nchoice = calculator.input.nextInt();
			
			switch(nchoice) {
				case 1:
					calculator.areaRectangle();
					break;
				case 2:
					calculator.areaTriangle();
					break;
			}
		}
	}
}
