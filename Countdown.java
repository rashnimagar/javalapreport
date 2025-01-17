package Thread;

public class Countdown extends Thread {
    private int count;
    public Countdown(int count){
        this.count = count;
    }
    public void run(){
        while(count>0){
            System.out.println("Time left: " + count);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            count--;
        }
        System.out.println("Countdown finished!");
    }
    public static void main(String[] args) {
        Countdown timer = new Countdown(5);
        timer.start();
    }
}
