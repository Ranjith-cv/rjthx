package Ranjithqs;

import java.util.HashMap;
import java.util.Map;

public class Repeatingchrs {

	public static void main(String[] args) {
		
		
		String s="i am ranjith";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : s.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print repeating characters
        System.out.println("Repeating characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }

	}

}
}
