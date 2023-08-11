package core.java;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n=9;
		int count=0;
		
		if(n==1||n==0) {
			System.out.println("no is not prime ");
		}
		
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==1) {
			System.out.println("no is prime");
		}
		else {
			System.out.println("Not prime");
		}
		
	}
}
