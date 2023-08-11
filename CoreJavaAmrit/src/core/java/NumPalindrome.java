package core.java;

public class NumPalindrome {

	public static void main(String[] args) {
		
		int rem,sum = 0,number=3223;
		int temp=0;
		number=temp;
		while(number>0) {
			  rem=number%10;
			  sum=sum*10+rem;
			  number=number/10;
		}
		System.out.println("Reverse of number is: "+sum);
		
		if(sum==number) {
		System.out.println("number is palindrome");
	   }
		else {
			System.out.println("number is not palindrome");
		}
	}
}
