package ArraysAndHashing;

public class ConcatenationOfArray1 {

	public int[] getConcatenation(int[] nums) {
		int nums2[] = new int[2 * nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
			nums2[nums.length + i] = nums[i];
		}
		return nums2;
	}
}
