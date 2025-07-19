package interviewProblems;

import java.util.Scanner;

public class CountDigits {
	public static void main(String args[]) {
		//Count number of digits in a number
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value of a: ");
		int a = sc.nextInt();

		//int len = String.valueOf(a).length();
		int m = a;
		int len = 0;

		while (m!= 0) {
			len++;
			m /= 10;
		}

		System.out.println("Length of the number: " + len);

	}

}
