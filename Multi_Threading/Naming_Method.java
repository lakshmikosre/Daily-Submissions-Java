package MultiThreading;

import java.lang.Thread;


class Compliment
{
	public void laksh()
	{
		System.out.println("Cute");
	}
	
}
public class Naming_Method {

	public static void main(String[] args) {
		
		
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName()); // main Thread
		
		Thread.currentThread().setName("Lakshmi");
		System.out.println(Thread.currentThread().getName());
		
		Compliment ct = new Compliment();
		ct.laksh();
	}

}
