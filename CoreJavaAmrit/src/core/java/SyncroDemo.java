package core.java;

class call{
	public void call(String msg) {
		System.out.println("["+msg);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class callback implements Runnable{
  Thread t;
  call c;
  String msg;
       
  public callback(String msg,call c) {
	  this.msg=msg;
	  this.c=c;
	  t=new Thread(this);	  
  }
	
	@Override
	public void run() {
		  synchronized (c) {
			c.call(msg);
		}
	}
	
}
public class SyncroDemo {
    public static void main(String[] args) {
		call c=new call();
		callback cb=new callback("Amrit", c);
		callback cb1=new callback("kumar", c);
		callback cb2=new callback("prajapat", c);
	}
}
