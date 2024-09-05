package MultiThreading;

// Performing single task from multiple Threads

class MyThread6 extends Thread{
	     public void run() 
	     {
	    	 for(int i=0;i<=10;i++) 
	    	 {
	    		 System.out.println(i);
	    	 }
	     }
}
public class Main {

	public static void main(String[] args) {
		
		MyThread6 mt =  new MyThread6();
		mt.run();
		
		MyThread6 mt2 = new MyThread6();
		mt2.run();

	}

}
