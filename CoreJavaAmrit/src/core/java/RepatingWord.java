package core.java;

/*Java Program to find maximum and minimum occurring character in a string.*/
public class RepatingWord {

	public static void main(String[] args) {
		
		String str="java";
		
		int[] freq=new int[str.length()];
		
	   char minChar = str.charAt(0);
	   char maxChar= str.charAt(0);
	   
	   char charArray[]=str.toCharArray();
	   
	   int i,j,min,max;
	   
	   for(i=0;i<str.length();i++) {
		   freq[i]=1;
      	 //System.out.println(freq[i]);
		for(j=i+1;j<str.length();j++) {
			if(charArray[i]==charArray[j] &&charArray[i]!=' '&&charArray[i]!='0') {
				freq[i]++;
				
				//set charArray[j] to 0 to avoid printing duplicate cha
				charArray[j]='0';
			}
		}
		   
	   }
		
	   min=max=freq[0];
	   for(i=0;i<freq.length;i++) {
		   
	   if(min>freq[i] && freq[i]!='0') {
		   min=freq[i];
		   minChar=charArray[i];
	   }
	   if(max<freq[i] && freq[i]!='0') {
		   max=freq[i];
		   maxChar=charArray[i];
	   }
	  }
	   
	   System.out.println("min l:"+minChar);
	   System.out.println("max l:"+maxChar);

	   
	}
}
