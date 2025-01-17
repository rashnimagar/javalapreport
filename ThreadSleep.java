package Thread;
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from thread!");
            try {
                Thread.sleep(500);  // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadSleep {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();  // Start the thread
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from main thread!");
            try {
                Thread.sleep(500);  // Pause for 300ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
