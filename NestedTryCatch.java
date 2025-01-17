package ExceptionHandlingExample;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            try{
                int[] arr = new int[5];
                arr[10] = 100;//ArrayIndexOutOfBoundsException
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inner catch block: Array index out og bounds.");
                throw new ArithmeticException("Throwing ArithmeticException");
            }
        }catch(ArithmeticException e){
            System.out.println("Outer catch bolck: " + e.getMessage());
        }
    }
}
