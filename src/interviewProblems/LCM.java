package interviewProblems;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("enter value of a: ");
		int a=sc.nextInt();
		
		System.out.println("enter value of b: ");
		int b=sc.nextInt();
		
		int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;

        int lcm = (a * b) / gcd;
        System.out.println("LCM is: " + lcm);

	}

}
