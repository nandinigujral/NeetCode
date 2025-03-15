package ArraysAndHashing;

public class ReplaceElementWithGreatestElement2 {

	public static int[] replaceElements(int[] arr) {
		int[] a = new int[arr.length];
        int n = arr.length;
        a[n-1] = -1;
        for(int i =0; i < arr.length-1; i++){
            int b = arr[i+1];
            for(int j = i+1; j < arr.length; j++){
                if(b < arr[j]){
                    b = arr[j];
                }
            }
            a[i] = b;
        }
        return a;
	}

	public static void main(String[] args) {

		System.out.println("Start the Program");
		int[] num = { 1, 2, 3, 7, 9, 5 };
		replaceElements(num);
	}

}
