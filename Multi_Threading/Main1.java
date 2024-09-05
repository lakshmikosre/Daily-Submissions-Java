package MultiThreading;

// Performing Multiple task from Multiple Threads

class MyThread5 extends Thread{
	
	public void run() {
		  for(int i=0 ; i <=5; i++)
		  {
			  System.out.println(i);
		  }
	}
}
class MyThread4 extends Thread{
	
	public void run() {
		System.out.println("Lakshmi"+"Kosre");
	}
}

public class Main1 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MyThread5 mt = new MyThread5();
		mt.run();
		
		@SuppressWarnings("unused")
		MyThread4 mt2 = new MyThread4();
		mt2.run();
		
		
	}

	}



