package core.java;

public class StringOperations {

	public static void main(String[] args) {
		String str="000111023032223";
		int len=str.length();
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
				
			}
		}
		
	}
}
