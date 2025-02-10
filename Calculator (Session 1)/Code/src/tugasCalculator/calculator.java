package tugasCalculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double total = 0.0;
		double num1;
		double num2;
		int choice = 0;
		
		while(choice != 7) {
			if(choice != 0) System.out.println();
			System.out.println("Calculator Raynard Chandrawangsa");
			System.out.println("====================================");
			
			System.out.println("Total = " + total + "\n");
			
			if(choice == 0 || choice == 6) {
				System.out.print("Input number : ");
				num1 = input.nextInt();
			}
			else {
				num1 = total;
			}
			
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulo");
			System.out.println("6. Clear Total");
			System.out.println("7. Exit");
			System.out.print("Operator [1...7]: ");
			choice = input.nextInt();
			
			if(choice == 6) {
				total = 0.0;
				continue;
			}
			else if(choice == 7) {
				break;
			}
			
			System.out.print("Input number : ");
			num2 = input.nextInt();
			
			switch(choice) {
				case 1:
					total = num1 + num2;
					break;
					
				case 2:
					total = num1 - num2;
					break;
					
				case 3:
					total = num1 * num2;
					break;
					
				case 4:
					total = num1 / num2;
					break;
					
				case 5:
					total = num1 % num2;
					break;			
			}
		}
	}

}