package core.java;

public class VowelConsonat {
  
	public static void main(String[] args) {
		String s="my name is AMrit prajapat";
		   s.toLowerCase();
		int cCount=0,vCount=0;
		   System.out.println(s.length());
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			   vCount++;
	     	}
		  else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
		    	cCount++;
		    }
	}
		
		System.out.println("Vowels: "+vCount);
		System.out.println("Consonants : "+cCount);
		
	}
}

