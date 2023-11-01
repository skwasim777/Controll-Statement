package LadderIf;

import java.util.Scanner;

public class FindLowerUpper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character :");
		char ch = scanner.next().charAt(0);
		if (ch >= 'a' && ch <= 'z')
			System.out.println("Lower case charcter");
		else if (ch >= 'A' && ch <= 'Z')
			System.out.println("Upper case character");
		else if (ch >= '0' && ch <= '9')
			System.out.println("Digit");
		else
			System.out.println("Special character");
	}
}
