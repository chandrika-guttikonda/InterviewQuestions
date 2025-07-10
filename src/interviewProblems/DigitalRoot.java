package interviewProblems;

import java.util.Scanner;

public class DigitalRoot {

	
	public static void main(String[] args) {
		// Given an integer, repeatedly add its digits until the result has only one digit.
		
		Scanner sc=new Scanner(System.in);

		int rev=0;
		System.out.println("enter value of n: ");
		int n=sc.nextInt();
		int rem=0;
		
		while(n>=10) {
			int m=n;
			int sum=0;
			while(n!=0) {
				rem=n%10;
				sum+=rem;
				n=n/10;
			}
			n=sum;
		}
		System.out.println(n);

	}

}
