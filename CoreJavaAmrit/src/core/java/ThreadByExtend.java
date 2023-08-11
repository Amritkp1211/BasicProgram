package core.java;

class Parent extends Thread{
	 public void run() {
		 try {
			while(true) {
				System.out.println("hello");
				 Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }	
}
public class ThreadByExtend {
    public static void main(String[] args) {
		Parent t=new Parent();
		t.start();
	}
}
