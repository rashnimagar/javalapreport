package StructureOfJava;

import java.util.Scanner;
public class PositiveNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if(a >= 0){
            System.out.println(a + " is positive number.");
        }
        else{
            System.out.println(a + " is negative number.");
        }
        sc.close();
    }
}
