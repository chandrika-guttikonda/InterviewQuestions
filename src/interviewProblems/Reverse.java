package interviewProblems;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter value of n: ");
		int n = sc.nextInt();
		
		int m=n;
		int rev=0;
		
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;

	}
		System.out.println("Reverse of number: "+rev);
	}
	

}
