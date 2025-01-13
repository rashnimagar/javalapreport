package DataTypesVariabesOperators;

import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();
        double c;
        c = a;
        a = b;
        b = c;
        System.out.println("The values of a and b after swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        sc.close();
    }
}
