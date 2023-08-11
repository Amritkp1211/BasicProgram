package core.java;

import java.util.HashMap;

public class Mapexample {

	public static void main(String[] args) {
		HashMap<String,Object> map=new HashMap<>();
		 int amount=10*100; 
		map.put("amount",amount);
		
		/*
		 * int i = Integer.parseInt((String) map.get("amount")); int w=i/100;
		 */
		 int i=(int)map.get("amount");
		 
		 double div=i/100;
		 
		  String string2 = Double.toString(div);
		     
		  
		
		  System.out.println(string2);
		
	}
}
