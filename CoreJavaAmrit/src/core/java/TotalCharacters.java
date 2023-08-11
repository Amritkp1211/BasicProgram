package core.java;

public class TotalCharacters {

	public static void main(String[] args) {
		
		String s="To count the number of characters present in the string";
		int count=0;
		int space=0;
		   for(int i=0;i<s.length();i++) {
			   if(s.charAt(i)!=' ') {
				   count++;
			   }
			   else {
				   space++;
			   }
		   }
		   System.out.println("Total Count: "+count);
		System.out.println("Space :"+space);
	}
}
