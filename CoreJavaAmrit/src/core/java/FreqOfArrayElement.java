package core.java;

/*Program to find the frequency of each element in the arra*/
public class FreqOfArrayElement {

	public static void main(String[] args) {
		
		int[] array= {1,3,4,3,1,2,3,3,2,1,2,3,3,1,2,4,4};
		
		int[] array2=new int[array.length];
		int count;
		int visited=-1;
		int i,j;
	
		for(i=0;i<array.length;i++) {
			count=1;
			for(j=i+1; j<array.length;j++) {
				if(array[i]==array[j]) {
					
					count++;
					
					array2[j]=visited;
				}
			}
			
			if( array2[i]!=visited) {
				
				array2[i]=count;
			}
			
		}
		
		for(i=0;i<array2.length;i++) {
			
			if(array2[i]!=visited) {
				
				System.out.println(" "+array[i]+" | "+array2[i]);
			}
		}
		
	}
}
