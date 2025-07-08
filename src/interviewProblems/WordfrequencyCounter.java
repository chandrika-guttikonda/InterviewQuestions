package interviewProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordfrequencyCounter {
	public static void main(String args[]) {

		// Write a program that counts the frequency of each word in a given
		// sentence.Ignore case and punctuation. Return the words in any order.

		// Input: "Java is great. Java is object-oriented."

		// java : 2 is : 2 great : 1 objectoriented : 1

		Scanner sc = new Scanner(System.in); // Create scanner object
		System.out.println("enter the string value");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
	}

}
