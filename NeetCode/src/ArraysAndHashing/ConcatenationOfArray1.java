package ArraysAndHashing;

public class ConcatenationOfArray1 {
	public static int[] getConcatenation(int[] nums) {
		int[] result = new int[nums.length * 2];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			result[index++] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			result[index++] = nums[i];
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("Start the Program");
		int[] num = { 1, 2, 3, 7, 9, 5 };
		getConcatenation(num);
	}
}