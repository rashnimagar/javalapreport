package Thread;

class Fibonacci extends Thread{
    private int n;
    public Fibonacci(int n){
        this.n = n;
    }
    public void run(){
        System.out.println("Fibonacci series of " + n + " is: ");
        for(int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
    }
    private int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
} 
public class Recursive {
    public static void main(String[] args) {
        Fibonacci t1 = new Fibonacci(5);
        t1.start();
    }
}
