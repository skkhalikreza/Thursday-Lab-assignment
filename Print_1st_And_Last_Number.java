package Lab_Assignment;

import java.util.Scanner;

public class Print_1st_And_Last_Number {

	public static void main(String[] args) {
		int number, firstDigit = 0, lastDigit = 0;

		System.out.println("Enter the Number To Find First & Last Digit:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		lastDigit = number % 10;
		System.out.println("Last digit Number Is: " + lastDigit);

		while (number != 0) {
			firstDigit = number % 10;
			number = number / 10;
		}
		System.out.println("First digit Number Is: " + firstDigit);

	}

}
