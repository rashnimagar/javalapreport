package DataTypesVariabesOperators;

import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b: ");
        float b = sc.nextFloat();
        float result;
        System.out.println("Enter an operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':{
                result = a+b;
                System.out.println("Addition: " + result);
                break;
            }
            case '-':{
                result = a-b;
            System.out.println("Subtraction: " + result);
            break;
            }
            case '*':{
                result = a*b;
                System.out.println("Multiplication: " + result);
                break;
            }
            case '/':{
                result = a/b;
                System.out.println("Division: " + result);
                break;
            }
            case '%':{
                result = a%b;
                System.out.println("Modulus: " + result);
                break;
            }
            default:{
                System.out.println("Invalid operator.");
                break;
            }
        }
        sc.close();
    }
}
