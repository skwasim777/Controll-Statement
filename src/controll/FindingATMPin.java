package controll;

import java.util.Scanner;

public class FindingATMPin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 4 Digit ATM Pin Number :");
		int n = s.nextInt();
		if (n < 1000 || n > 9999)
			System.out.println("INVALID PIN");
		System.out.println("Thank you have a nice day dear......");
	}
}
