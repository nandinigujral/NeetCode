package ArraysAndHashing;

public class IsSubsequence1 {
	
	    public static boolean isSubsequence(String s, String t) {
	        int n = s.length();
	        int a = 0;
	         if (n == 0) return true;
	        for(int i = 0; i < t.length(); i++){
	            if(s.charAt(a)==t.charAt(i)){
	                a++;
	                if(a==n){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		System.out.println("Start the Program");
		String s = "cat";
		String t = "rat";
		
		isSubsequence(s, t);
		

	}

}
