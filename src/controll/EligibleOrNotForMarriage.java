package controll;

import java.util.Scanner;

public class EligibleOrNotForMarriage {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter person age :");
		int age = s.nextInt();
		System.out.println("Enter gender :");
		char gen = s.next().charAt(0);
		if (age <= 21 || (gen == 'f' || gen == 'F') && age >= 18) {
			System.out.println("Eligible..");
		} else {
			System.out.println("not eligible...");
		}
	}
}
