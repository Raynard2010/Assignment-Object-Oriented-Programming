package tugasArrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class TugasArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> pass = new ArrayList<String>();
		ArrayList<String> phone = new ArrayList<String>();

		int choice = 0;
		
		while(choice != 4) {
			System.out.println("ArrayList Raynard Chandrawangsa");
			
			System.out.println("1. Input Data");
			System.out.println("2. Show Data");
			System.out.println("3. Delete Data");
			System.out.println("4. Exit");
			System.out.print("Your choice: ");
			
			choice = input.nextInt();
			input.nextLine();

			if(choice == 1) {
				String newName;
				String newPass;
				String newPhone;
				
				System.out.print("Name : ");
				newName = input.nextLine();
				
				System.out.print("Pass : ");
				newPass = input.nextLine();
				
				System.out.print("Phone : ");
				newPhone = input.nextLine();
				
				name.add(newName);
				pass.add(newPass);
				phone.add(newPhone);
				
				System.out.println("New data is added\n");
			}
			else if(choice == 2) {
				System.out.println("============================================================================");
				System.out.printf("|No| %21s | %21s | %21s |\n", "Name", "Pass", "Phone");
				System.out.println("|===========================================================================");
				
				if(name.isEmpty()) {
					System.out.println("               |No data exists|\n");
					continue;
				}
				
				for(int i = 0; i < name.size(); i++) {
					System.out.printf("|%2d| %21s | %21s | %21s |\n", i + 1, name.get(i), pass.get(i), phone.get(i));					
				}
				
				System.out.println("============================================================================\n");
			}
			else if(choice == 3) {
				int ndelete;
				
				System.out.println("============================================================================");
				System.out.printf("|No| %21s | %21s | %21s |\n", "Name", "Pass", "Phone");
				System.out.println("|===========================================================================");
				
				if(name.isEmpty()) {
					System.out.println("               |No data exists|\n");
					continue;
				}
				
				for(int i = 0; i < name.size(); i++) {
					System.out.printf("|%2d| %21s | %21s | %21s |\n", i + 1, name.get(i), pass.get(i), phone.get(i));					
				}
				
				System.out.println("============================================================================");
				
				System.out.print("Input data number to be deleted: ");
				ndelete = input.nextInt();
				input.nextLine();
				
				name.remove(ndelete - 1);
				pass.remove(ndelete - 1);
				phone.remove(ndelete - 1);
				
				System.out.println("Data is removed\n");
			}
		}
	}
}