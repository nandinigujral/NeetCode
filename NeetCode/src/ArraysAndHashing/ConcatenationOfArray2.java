package ArraysAndHashing;

public class ConcatenationOfArray2{

	public static int[] getConcatenation(int[] nums) {
		int nums2[] = new int[2 * nums.length];
		for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
			nums2[nums.length + i] = nums[i];
		}
		return nums2;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Start the Program");
		int[] num = {1 , 2, 3, 7 , 9, 5};
		getConcatenation(num);
	}
}
