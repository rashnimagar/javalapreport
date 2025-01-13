package DataTypesVariabesOperators;

import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int i;
        System.out.println("Enter 5 numbers: ");
        for(i=0; i<5; i++){
            array[i] = sc.nextInt();
        }
        
        System.out.println("The entered numbers are: ");
        for(i=0; i<5; i++){
            System.out.println(array[i]);
        }
        
        System.out.println("The reversed numbers are: ");
        for(i=4; i>=0; i--){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
