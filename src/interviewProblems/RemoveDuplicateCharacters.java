package interviewProblems;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		// Given a string, return a new string after removing all duplicate characters but preserve the original order of appearance.

		//input: automation
		//output: automin
		
		Scanner sc = new Scanner(System.in);  // Create scanner object
		System.out.println("enter the string value");
		String str=sc.nextLine();
		
		LinkedHashSet<Character> seen = new LinkedHashSet<>();
		StringBuilder result = new StringBuilder();
		
		for(char c:str.toCharArray()) {
			if(!seen.contains(c)) {
				seen.add(c);
				result.append(c);
			}
		}
		System.out.println("String without Duplicates: "+ result);
	}

}
