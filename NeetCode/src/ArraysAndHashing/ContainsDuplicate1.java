package ArraysAndHashing;

import java.util.Arrays;

public class ContainsDuplicate1 {
	
	    public static boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums);
	        if(nums.length < 2){
	            return false;
	        }

	        for(int i=1;i<nums.length;i++){
	            if(nums[i]==nums[i-1]){
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) {
			
			System.out.println("Start the Program");
			int[] num = {1 , 2, 3, 7 , 9, 5};
			containsDuplicate(num);
		}

}
