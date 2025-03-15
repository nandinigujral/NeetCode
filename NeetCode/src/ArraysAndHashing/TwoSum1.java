package ArraysAndHashing;

public class TwoSum1 {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}
		}

		return result;

	}

	public static void main(String[] args) {
		System.out.println("Start the Program");
		int[] num = { 1, 7, 8, 9 };
		int target = 10;

		twoSum(num, target);

	}

}
