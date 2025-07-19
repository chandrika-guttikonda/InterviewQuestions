package interviewProblems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// A number is Armstrong if sum of its digits each raised to power of number of digits equals the number itself.
		
		Scanner sc=new Scanner(System.in);

		int res=0;
		System.out.println("enter value of n: ");
		int n=sc.nextInt();
		int m=n;
		
		int len=String.valueOf(n).length();
		
		while(n>0) {
			int rem=n%10;
			res=(int) (res+ Math.pow(rem, len));
			n=n/10;
		}
		if(res==m) {
			System.out.println(m+" is a Armstrong number");

		}
		else {
			System.out.println(m+" is not a Armstrong number");
		}

	}

}
