import java.util.ArrayList;
import java.util.List;

public class Demo {
public static void main(String[] args) {

	  List<String> list =new ArrayList<>();
	    list.add("192.168.43.45");
	    list.add("193.168.43.45");
	    list.add("194.168.43.45");
	    list.add("195.168.43.45");
	    list.add("196.168.43.45");

	    System.out.println(list);
	    int i=0;
	    for(String s : list) {
	    	
	    	System.out.println(list.get(i));
	    	
	    	i++;
	    }
}
	
}
