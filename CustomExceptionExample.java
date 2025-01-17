package ExceptionHandlingExample;
//creating custom exception handling example
class PasswordException extends Exception{
     public PasswordException(String message){
        super(message);
     }
}
public class CustomExceptionExample {
    public static void main(String[] args) {
        try{
            String password = "Rashni12";
            if(password.equals("Rashni12")){
                System.out.println("Password matched successfully!");
            }
            else{
                throw new PasswordException("Password not matched.  Try again......");
            }
        }
        catch(PasswordException e){
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
