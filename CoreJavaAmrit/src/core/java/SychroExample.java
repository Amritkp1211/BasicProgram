package core.java;

class Table{
	synchronized void printtable(int n) {
		try {
			for(int i=1;i<11;i++) {
				System.out.println(n*i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}

class Mythread extends Thread {
	 Table t;
	  public Mythread(Table t) {
		  this.t=t;
	  }
	    public void run() {
	    	t.printtable(5);
	    	System.out.println("mythread obj complete");
	    }
}

class Mythread1 extends Thread{
	Table t;
	public Mythread1(Table t) {
		this.t=t;
	}
	
	public void run() {
		t.printtable(10);
	}
}

public class SychroExample {
   public static void main(String[] args) {
	  Table t=new Table();
	  Mythread m=new Mythread(t);
	  Mythread1 m1=new Mythread1(t);
	  m.start();
	  m1.start();
}
}
