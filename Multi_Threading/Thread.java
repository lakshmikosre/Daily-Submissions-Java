package java.Multi_Threading;

class MyThreads extends Thread
{
	public void run() {
		for ( int i= 0; i<=10; i++);
		{
			System.out.println("My Threads........");
		}
	}	
}
class Thread 
{
	public static void main(String []args)
	{
		MyThreads mt = new MyThreads();
		mt.run();
		for (int i =0; i<=10; i++)
		{
			System.out.println("Main Threads...........");
		}
	}
}