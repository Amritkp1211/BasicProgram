package core.java;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		Random random = new Random();
		   int i = random.nextInt(10000);
		   System.out.println(i);
	}
}
