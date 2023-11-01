package controll;

import java.util.Scanner;

public class ELeigibleOrNotForMarrage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter person age:");
		int age = scanner.nextInt();
		System.out.println("Enter person gender (M/F):");
		char gen = scanner.next().charAt(0);

		if ((gen == 'M' || gen == 'm') && age >= 21) {
			System.out.println("Eligible for marriage.");
		} else if ((gen == 'F' || gen == 'f') && age >= 18) {
			System.out.println("Eligible for marriage.");
		} else 
			System.out.println("Not eligible for marriage.");
		
	}
}
