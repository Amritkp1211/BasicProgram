package core.java;

public class ReverseAndPolindrome {

	public static void main(String[] args) {
		
		String str="nitine";
		String rev="";
		
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println("STring is polindrome");
		}
		else {
			System.out.println("Not polindrome");
		}
	}
}
