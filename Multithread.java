import java.lang.String;

class Multi1 extends Thread{
	public void run() {
		for(int i=1 ; i<=4 ; i++) {
			System.out.println("CSTThread is running");
		
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
	}
}
}

class Multi2 extends Thread{
	public void run() {
		for(int i=1 ; i<=4 ; i++) {
			System.out.println("ITThread is running");
		
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(i);
		}
	}
}
public class MultiThread {
public static void main(String args[]){
	Multi1 CSTThread = new Multi1();
	 CSTThread.start();
	 Multi2 ITThread = new Multi2();
	 ITThread.start();
}
}
