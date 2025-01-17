package Thread;

class PriorityThread extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority() + " is running.");
    }
}
public class TPriorityEx {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread();
        t1.setName("Low priority thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        PriorityThread t2 = new PriorityThread();
        t2.setName("High priority thread");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
