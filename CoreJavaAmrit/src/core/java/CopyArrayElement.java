package core.java;

/*Program to copy all elements of one array into another array*/
public class CopyArrayElement {
	
	public static void main(String[] args) {
		
		int[] Array= {34,45,23,23,45,65,67,23};
		
		int array2[]=new int[Array.length];
		
		for(int i=0;i<Array.length;i++) {
			
			 array2[i]=Array[i];
		}
		
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
		
		
	}

}
