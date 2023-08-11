package core.java;

public class CaseCOnversion {

	public static void main(String[] args) {
		String str="YashpaL";
		
		StringBuffer strr=new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			 
			if(Character.isLowerCase(str.charAt(i))) {
				  strr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else {
				strr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(strr);
		
	}
}
