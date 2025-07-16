package interviewProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllPrimesUpToN {

	public static void main(String[] args) {
//		Write a Java program to print all prime numbers between 1 and a given number N.
//		For example, if N=10, output should be: 2, 3, 5, 7.

		Scanner sc = new Scanner(System.in);

		System.out.println("enter value of n: ");
		int n = sc.nextInt();
		List<Integer> primes = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			boolean isprime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				primes.add(i);
			}
		}
		System.out.println("Prime number upto " + n + " : " + primes);

	}

}
