package core.java;

/*Java Program to find maximum and minimum occurring character in a string.*/
public class DuplicateChar {
	
	public static void main(String[] args) {
	 
		int count;
	String s="great responsibility";
    char[] charArray = s.toCharArray();
    
    for(int i=0;i<charArray.length;i++) {
    	count=1;
    	for(int j=i+1;j<charArray.length;j++) {
    		
    		if(charArray[i]==charArray[j] && charArray[i]!=' ') {
    			
    			count++;
    			charArray[j]='0';
    		}
    	}
    	
    	if(count>1&& charArray[i]!='0') {
    		System.out.println(charArray[i]);
    	}
    }
	
	}       

}
