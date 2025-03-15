package ArraysAndHashing;

public class LenghtOfLastWord1 {
	    public static int lengthOfLastWord(String s) {
	        String[] ch = s.split("\\s");
	        return ch[ch.length-1].length();
	        
	    }
	    public static void main(String[] args) {
			System.out.println("Start the Program");
			String s = "hello cat";
			
			lengthOfLastWord(s);
			

		}

}
