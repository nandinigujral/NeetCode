package ArraysAndHashing;

public class LongestCommonPrefix1 {

	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String prefix = strs[0];
		for (String s : strs)
			while (s.indexOf(prefix) != 0)
				prefix = prefix.substring(0, prefix.length() - 1);
		return prefix;
	}

	public static void main(String[] args) {
		System.out.println("Start the Program");
		String s[] = { "cat", "bat", "cap" };

		longestCommonPrefix(s);

	}

}
