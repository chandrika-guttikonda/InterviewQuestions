package interviewProblems;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// find the greatest common divisor of two numbers

		Scanner sc=new Scanner(System.in);

		System.out.println("enter value of a: ");
		int a=sc.nextInt();
		
		System.out.println("enter value of b: ");
		int b=sc.nextInt();
		
		while(b!=0) {
			int temp = b;
            b = a % b;
            a = temp;
		}
		
		System.out.println("GCD: "+a);
	}

}
