package Swap;

class SwapVar <T>{
	T x1, x2;
	
	public void set(T x1, T x2) {
		this.x1 = x1;
		this.x2 = x2;
	}
	
	public void swap() {
		T temp = x1;
		x1 = x2;
		x2 = temp;
	}
	
	public void print() {
		System.out.println("Variable 1: " + x1);
		System.out.println("Variable 2: " + x2);
	}
}

public class SwapMain {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		SwapVar<Integer> swapInteger = new SwapVar<>();
		swapInteger.set(num1, num2);
		
		System.out.println("Before swapping:");
		swapInteger.print();
		
		swapInteger.swap();

		System.out.println("After swapping:");
		swapInteger.print();
		
		System.out.println();
		
		String s1 = "Hello OOP";
		String s2 = "Hello World";
				
		SwapVar<String> swapString = new SwapVar<>();
		swapString.set(s1, s2);
				
		System.out.println("Before swapping:");
		swapString.print();
				
		swapString.swap();

		System.out.println("After swapping:");
		swapString.print();		
	}
}