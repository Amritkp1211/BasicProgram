import java.util.HashMap;


public class HashTable {

	public static void main(String[] args) {
		
	HashMap<Integer, String> map=new HashMap<>();	
	  int count=0;

	   for(int i=0;i<args.length;i++) {	
		 map.put(count+1,args[i]);
		count++;
	 }
	    System.out.println(map);	
	}

//		HashMap<String, String> map=new HashMap<>();	
//		int count=0;
//		   for(int i=0;i<args.length;i++) {	
//			map.put(args[i].toString(),args[i]);
//			count++;
//		 }
//		    System.out.println(map);	
//		}
	
	}

