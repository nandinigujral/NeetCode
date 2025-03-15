package ArraysAndHashing;

public class ReplaceElementWithGreatestElement1 {

	public static int[] replaceElements(int[] arr) {
		int[] result = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int max = 0;
			for (int j = i; j < arr.length - 1; j++) {
				max = Math.max(max, arr[j + 1]);
			}
			result[index++] = max;
		}
		result[arr.length - 1] = -1;
		return result;
	}

	public static void main(String[] args) {

		System.out.println("Start the Program");
		int[] num = { 1, 2, 3, 7, 9, 5 };
		replaceElements(num);
	}

}
