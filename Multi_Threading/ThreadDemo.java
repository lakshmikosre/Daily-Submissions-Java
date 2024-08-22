package java.Multi_Threading;

class Test implements Runnable {
    public void run() {
        System.out.println("Thread 2");
    }
    
    class MyThread extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("newThread......");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Test t = new Test();
        Test.MyThread th = t.new MyThread();
        t.run();

        System.out.println("Main thread finished");
    }
}
