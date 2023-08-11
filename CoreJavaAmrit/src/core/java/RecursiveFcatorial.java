package core.java;

public class RecursiveFcatorial {

	public static int factorial(int i) {
		if(i==0 || i==1) {
			return 1;
		}
		else {
			return i*factorial(i-1);
		}
		
	}
	public static void main(String[] args) {
	
		int n=5;
		int i = factorial(n);
		System.out.println("Factorial of "+n+" is : "+i);
		
	}
}
