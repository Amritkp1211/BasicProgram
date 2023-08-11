package core.java;

public class ThirdArrayElement {
	

	private static int getThirdLargest(int[] arr, int length) {
		int temp;
		   for(int i=0;i<length;i++) {
			   for(int j=i+1;j<length;j++) {
				   if(arr[i]>arr[j]) {
					   temp=arr[i];
					   arr[i]=arr[j];
					   arr[j]=temp;
				   }
			   }
		   }
		return arr[length-3];
	}

	
	public static void main(String[] args) {
		int arr[]= {2,34,85,54,14,65};
		int arr2[]= {2,34,85,14,65};
		
		   System.err.println(" "+ getThirdLargest(arr,arr.length));
		  System.out.println(" "+ getThirdLargest(arr2,arr2.length));
			
	}

}
