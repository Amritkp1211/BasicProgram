package core.java;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first=0,second=1, third;
	   int n=10;
		
		System.out.print("Fibonacci series: " +first);
		
		for(int i=0;i<n;i++) {
			third=second+first;
			System.out.print(" "+third);
			first=second;
			second=third;
		}
		
	}
}
