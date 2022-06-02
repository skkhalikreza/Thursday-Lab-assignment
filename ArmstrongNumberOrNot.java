//to check  the number is Armstrong or not 

package Basic_programs;

import java.util.Scanner;

public class ArmstrongNumberOrNot {

	public static void arm(int n) {
		int temp, sum = 0, dig;

		temp = n; // n is a temp variable
		while (temp != 0) {
			dig = temp % 10;

			sum = sum + (dig * dig * dig); // Calculate the armstrong value
			temp = temp / 10; // remove the last digits

		}

		if (sum == n) {
			System.out.print("The Number is Armstrong Number");
		} else {
			System.out.println("The Number Is not Armstrong ");
		}

	}

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong or not:  "); // inputs from the user
		x = sc.nextInt();
		arm(x);
	}
}
