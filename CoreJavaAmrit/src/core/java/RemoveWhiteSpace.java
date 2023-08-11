package core.java;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str="Remove all white space";
		
		   String replaceAll = str.replaceAll("\\s", "");
		   System.out.println(replaceAll);
	}
}
