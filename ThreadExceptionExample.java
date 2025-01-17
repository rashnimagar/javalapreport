package ExceptionHandlingExample;

public class ThreadExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try{
                int result = 10/0;//arthmeticexception
            }
            catch(ArithmeticException e){
                System.out.println("Exception caught in thread: " + e.getMessage());
            }
        });
        thread.start();
    }
}
