package interviewProblems;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
//		Write a Java program to check whether a given integer n is a prime number or not.
//		A prime number is a natural number greater than 1 that has no divisors other than 1 and itself.
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value of n: ");
		int n = sc.nextInt();
		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false; // by definition, numbers <=1 are not prime
		} else {
			// check divisibility from 2 to sqrt(n)
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}
