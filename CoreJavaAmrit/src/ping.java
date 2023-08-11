import java.util.ArrayList;
import java.util.List;

public class ping {
public static void main(String[] args) {
	 String ipRange = "192.168.100.1-192.168.100.10";
     List<String> ipAddresses = getIPAddresses(ipRange);
     System.out.println(ipAddresses);
     
     for(String s:ipAddresses) {
    	 System.out.println(s);
     }
 }

 public static List<String> getIPAddresses(String ipRange) {
	 
     List<String> ipAddresses = new ArrayList();

     // Split the string by "-"
     String[] parts = ipRange.split("-");
     
     String startIP = parts[0];
     String endIP = parts[1];

     // Extract the last part of the IP address (i.e., the number after the last dot)
     String[] startIPParts = startIP.split("\\.");
     String[] endIPParts = endIP.split("\\.");
     
     int startIPLastPart = Integer.parseInt(startIPParts[3]);
     
     int endIPLastPart = Integer.parseInt(endIPParts[3]);

     // Generate all the 10 IP addresses
     for (int lastPart = startIPLastPart; lastPart <= endIPLastPart; lastPart++) 
     {
         String ipAddress =startIPParts[0] + "." + startIPParts[1] + "." + startIPParts[2] + "." + lastPart;
         ipAddresses.add(ipAddress);
     }

     return ipAddresses;
 }
	       
	

}

