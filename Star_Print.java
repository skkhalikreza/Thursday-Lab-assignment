package Lab_Assignment;

import java.util.Scanner;

public class Star_Print {

	public static void main(String[] args) {
		int n, i, j, k; // variables
		System.out.println("eneter row");
		Scanner sc = new Scanner(System.in); // creating object for scanner class
		n = sc.nextInt();

		// printing pattern
		for (i = 1; i <= n; i++) {
			for (j = n; j >= i; j--) {

				// for space
				System.out.print("  ");

			}
			for (k = 1; k < (i + i); k++) {
				System.out.print("* "); // printing stars

			}

			System.out.println(""); // printing next line

		}

	}
}
