package interviewProblems;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String args[]) {
		//Write a Java program to calculate the sum of all digits of a given integer number.
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value of n: ");
		int n = sc.nextInt();
		
		int m=n;
		int sum=0;
		
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		
		System.out.println("Sum of digits in a number: "+sum);
	}
}
