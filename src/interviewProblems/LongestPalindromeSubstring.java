package interviewProblems;

import java.util.Scanner;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("enter value of String: ");
		String input=sc.nextLine();
		
		
        System.out.println("Input string: " + input);
        String longest = longestPalindrome(input);
        System.out.println("Longest palindromic substring: " + longest);
    }

    public static String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for(int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);       // odd length
            int len2 = expandAroundCenter(s, i, i+1);     // even length
            int len = Math.max(len1, len2);
            if(len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end+1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

	

}
