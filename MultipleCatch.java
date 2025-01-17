package ExceptionHandlingExample;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            String[] arr = new String[5];
            arr[1] = "Hello";
            arr[5] = "Rashni";//ArrayIndexOutOfBoundsException
            arr[10] = "Thapa";//ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bounds");
        }
        catch(NullPointerException e){
            System.out.println("Error: Null pointer encountered");
        }
    }
}
