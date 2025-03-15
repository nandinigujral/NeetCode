package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ValidAnagram2 {

	public static boolean isAnagram(String s, String t) {

		Map<Character, Integer> a = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			a.put(s.charAt(i), a.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (char ch : t.toCharArray()) {
			a.put(ch, a.getOrDefault(ch, 0) - 1);
		}

		for (Entry<Character, Integer> pair : a.entrySet()) {
			if (pair.getValue() != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Start the Program");
		String s = "cat";
		String t = "rat";
		isAnagram(s, t);
	}
}
