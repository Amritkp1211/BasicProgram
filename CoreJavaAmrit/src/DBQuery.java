
public abstract class DBQuery {

	/*
	 * public static final String SET_SCAN_START_DETAILS =
	 * "insert into OBB0201MASCAN (start_time,discovery_id,target_details) values(getDate(),'NMAP','"
	 * ;
	 * 
	 * public static final String GET_SCAN_LASTE_ID_DATA =
	 * "select IDENT_CURRENT('OBB0201MASCAN')";
	 * 
	 * public static final String UPDATE_SCAN_END_TIME_DATA =
	 * "update OBB0201MASCAN set end_time = getDate() where scan_id = ";
	 * 
	 * public static final String SET_DEVICE_MASTER_DATA =
	 * "insert into OBB0202MADISCD (scan_id,ipv4,ipv6,mac_address) values(";
	 * 
	 * public static final String SET_DEVICE_DETAILS_DATA =
	 * "insert into OBB0203DEDISCD (device_detailsID,param_l1,param_l2,insert_time,ipv4,ipv6,value1,value2) values((select IDENT_CURRENT('OBB0202MADISCD')),'os_family','os_type',getDate(),'"
	 * ;
	 * 
	 * public static final String SET_PORT_DEVICE_DETAILS_DATA =
	 * "insert into OBB0203DEDISCD (device_detailsID,param_l1,param_l2,insert_time,ipv4,ipv6,value1,value2) values((select IDENT_CURRENT('OBB0202MADISCD')),'portid','service_name',getDate(),'"
	 * ;
	 * 
	 * public static final String SET_INVESTIGATE_LIST_DATA =
	 * "insert into OBB0204ADIDL (type1,type2,type3,insert_time,value1,value2,value3) values('IPV4','IPV6','MAC',getDate(),'"
	 * ;
	 */
	public static final String GEt_All_DATA="Select * from OBB0201MASCAN";
	
	public static final String INSERT_DETAILS="insert into OBB0201MASCAN (start_time,discovery_id,target_details) values(getDate(),'NMAP','";
	
	public static final String UPDATE_DETAILS="update OBB0201MASCAN set end_time= getDate() where sacn_id='";
    
	public static final String INSERT_DETAILS202="insert into OBB0202MADISCD (scan_id,ipv4) values((select IDENT_CURRENT('OBB0201MASCAN')),'";
 
	public static final String INSERT_DETAILS203="insert into OBB0203DEDISCD(device_detailsID,insert_time,ipv4,url) values((select IDENT_CURRENT('OBB0202MADISCD'),getDate(),";
}
