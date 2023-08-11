package core.java;

class Rajasthan extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("thread rajasthan is running");
				Thread.sleep(4000);
				if (i == 3) {
					break;
				}
				
			}
			System.out.println("thread rajasthan exit");
		} catch (Exception e) {

		}
	}
}

class Sirohis extends Thread {

	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println("thread Sirohi is running");
				Thread.sleep(2000);
				if (i == 5) {
					break;
				}
				
			}
			System.out.println("thread Sirohi exit");
		} catch (Exception e) {

		}
	}
}

class Sindrath extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("thread Sindrath is running");
				Thread.sleep(3000);
				if (i == 2) {
					break;
				}
				
			}
			System.out.println("thread sindrath exit");
		} catch (Exception e) {

		}
	}
}

  public class Multithreading {
	  	public static void main(String[] args) {
			Rajasthan r=new Rajasthan();
			Sirohis s=new Sirohis();
			Sindrath ss=new Sindrath();
			System.out.println(r.getPriority());
			System.out.println(s.getPriority());
			System.out.println(ss.getPriority());
			r.start();
			s.start();
			ss.start();
			r.setPriority(5);
			s.setPriority(7);
			ss.setPriority(3);
			System.out.println(r.getPriority());
			System.out.println(s.getPriority());
			System.out.println(ss.getPriority());
		}
   }
