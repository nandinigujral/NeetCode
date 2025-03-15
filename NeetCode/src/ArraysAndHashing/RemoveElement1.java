package ArraysAndHashing;

public class RemoveElement1 {

		    public int removeElement(int[] nums, int val) {
		        int i = 0;
		        int j = 0;
		        while (i < nums.length) {
		            nums[j] = nums[i];
		            if (nums[i] != val)
		                j++;
		            i++;
		        }

		        return j;
		    }
}