package USTBatchNo3.junit5testcase;

public class vowelcount {
	public static int countvowels(String input) {
		int c=0;
		String S1=input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			
			if (S1.charAt(i)=='a'||S1.charAt(i)=='e'||S1.charAt(i)=='i'||S1.charAt(i)=='o'||S1.charAt(i)=='u') 
					  c++;
				 
			
			
		} return c;
		
	}
		public static void main(String[] args) {
		 String input ="kodiyan";
		 int count = countvowels(input);
		 
	      System.out.println("the number of vowles in \""+input+"\"is:"+count);
		}}


