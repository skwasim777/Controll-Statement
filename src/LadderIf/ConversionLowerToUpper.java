package LadderIf;

import java.util.Scanner;

public class ConversionLowerToUpper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch = scanner.next().charAt(0);
		if (ch >= 'a' && ch <= 'z')
			ch = (char) (ch - 32);
		else if (ch >= 'A' && ch <= 'Z')
			ch = (char) (ch + 32);
		System.out.println(ch);
	}
}
