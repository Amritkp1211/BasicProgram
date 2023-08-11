package core.java;

public class SubsetOfStrung {
public static void main(String[] args) {
	
	String s="mynairit";
	int temp=0;
	
	int len =s.length()*(s.length()+1)/2;
	          System.out.println(len);
	          
	     String Strarry[]=new String[len];
	     
	for(int i=0;i<s.length();i++) {
		for(int j=i;j<s.length();j++) {
			   
			Strarry[temp]=s.substring(i,j+1);
			temp++;
		}
	}
	
	for(int k=0;k<Strarry.length;k++ ) {
		System.out.println(Strarry[k]);
	}
	
}

}
