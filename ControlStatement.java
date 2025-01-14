package ArrayStringControlStatements;

import java.util.Scanner;
public class ControlStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to control statement class!");
        System.out.println("Please enter a number between 1 and 5: ");
        int number = sc.nextInt();
        if(number<1||number>5){
            System.out.println("The number is out of range.");
        }
        else if(number == 1){
            System.out.println("You entered one.");
        }
        else if(number == 2){
            System.out.println("You entered two.");
        }
        else if(number == 3){
            System.out.println("You entered three.");
        }
        else if(number == 4){
            System.out.println("You entered four.");
        }
        else if(number == 5){
            System.out.println("You entered five.");
        }
        //looping statement
        System.out.println("Now let's count fron 1 to your number: ");
        for(int i=1; i<=number; i++){
            System.out.println(i);
        }
        //break statement
        System.out.println("Now let's play a guessing game: ");
        int secretNumber = 4;
        while(true){
            System.out.println("Guess the secret number(1-5): ");
            int guess = sc.nextInt();
            if(guess == secretNumber){
                System.out.println("Congratulations! You've guessed the secret number.");
                break;//exit the loop
            }
            else{
                System.out.println("Wrong guess, try again!");
            }
        }
        sc.close();
    }
}
