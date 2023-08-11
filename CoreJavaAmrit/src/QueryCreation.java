
public class QueryCreation {


	public int SetDetails203(String s,String l) {
		String str_query=null;
		 StringBuilder builder=new StringBuilder();
		 builder.append(DBQuery.INSERT_DETAILS203);
		 builder.append("'");
		// "insert into OBB0203DEDISCD(device_detailsID,insert_time,ipv4,url) 
		           //values((select IDENT_CURRENT('OBB0202MADISCD'),getDate(),'";
		 builder.append((l));
		 builder.append("','");
		 builder.append(s);
		 builder.append("')");
		 str_query=builder.toString();
		  System.out.println(str_query);
	
		
		return 1;
	}
	public int SetDetails202(String s){
		  String str_query=null;
		  StringBuilder builder=new StringBuilder();
		     builder.append(DBQuery.INSERT_DETAILS202);
		     //"insert into OBB0202MADISCD (scan_id,ipv4) values((select IDENT_CURRENT('OBB0201MASCAN')),'";
		     builder.append(s);   
		     builder.append("')");
		     str_query=builder.toString();
		     System.out.println(str_query);
		   //  int status=handleDatabaseQuery(str_query);
		  return 1;
		}
	
	public static void main(String[] args) {
		QueryCreation q=new QueryCreation();
		    q.SetDetails203("sSS","url");
		    q.SetDetails202("s");
		    
	}
}
