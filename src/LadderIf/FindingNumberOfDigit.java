package LadderIf;

import java.util.Scanner;

public class FindingNumberOfDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		if (number >= -9 && number <= 9)
			System.out.println("1 digit");
		else if (number >= -99 && number <= 99)
			System.out.println("2 digits");
		else if (number >= -999 && number <= 999)
			System.out.println("3 digits");
		else if (number >= -9999 && number <= 9999)
			System.out.println("4 digits");
		else
			System.out.println("More than 4 digits");
	}
}
