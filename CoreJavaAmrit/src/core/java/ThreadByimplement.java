package core.java;

class Sirohi implements Runnable{

	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("thread by runnable interface");
				Thread.sleep(2000);
			}
		} catch (Exception e) {
                  e.printStackTrace();
		}
		
	}
	
}

public class ThreadByimplement {
		public static void main(String[] args) {
			Sirohi s=new Sirohi();
			Thread t=new Thread(s);
			t.start();
		}
}
