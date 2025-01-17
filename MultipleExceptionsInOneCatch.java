package ExceptionHandlingExample;

public class MultipleExceptionsInOneCatch {
    public static void main(String[] args) {
        try{
            String[] arry = new String[5];
            arry[5] = "Hello";//ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str); //NullPointerException
        }
        catch(ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Error: " + e.getClass().getSimpleName() + " occurred.");
        }
    }
}
