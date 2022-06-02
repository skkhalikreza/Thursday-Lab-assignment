//Write a Programs to check The Number is Perfect or not

package Basic_programs;

import java.util.Scanner;

public class Perfect_Number {

	public static boolean checkPerfectNo(int n) {
		int i, sum = 0; // veriables Store
		for (i = 1; i < n; i++)// i=1<6t
		{
			if (n % i == 0)// 6%1=0t
			{
				// sum = sum + i; //
				sum += i;
			}
		}
//		if (n == sum)
//			return true;
//		else
//			return false;

		boolean b = (n == sum) ? true : false;
		return b;
	}

	public static void main(String[] args) {

		int num;
		boolean result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check perfect num or not:-");
		num = sc.nextInt();
		result = Perfect_Number.checkPerfectNo(num);
		System.out.println(result);

	}

}
