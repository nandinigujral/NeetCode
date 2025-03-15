package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ConatinsDuplicate2 {

	public static boolean containsDuplicate(int[] nums) {

		Set<Integer> numSet = new HashSet<>();

		for (int n : nums) {
			if (numSet.contains(n)) {
				return true;
			}
			numSet.add(n);
		}

		return false;

	}

	public static void main(String[] args) {

		System.out.println("Start the Program");
		int[] num = { 1, 2, 3, 7, 9, 5 };
		containsDuplicate(num);
	}
}
