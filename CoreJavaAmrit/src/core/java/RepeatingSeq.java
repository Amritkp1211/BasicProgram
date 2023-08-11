package core.java;

public class RepeatingSeq {
	
	public static String LRSsolve(String s,String t) {
		int min = Math.min(s.length(), t.length());	
		for(int i=0;i<min;i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				return s.substring(0,i);
			}
		}
		
		return s.substring(0,min);
	}
	
	
	public static void main(String[] args) {
		
		String s="aabbhaderabbb";
		String lrs="";
		
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				String str = LRSsolve(s.substring(i,n),s.substring(j,n));

				if(str.length()>lrs.length()) {
					lrs=str;
				}
			}
		}
		System.out.println("longest repeating sequence:"+lrs);
		}
	}

