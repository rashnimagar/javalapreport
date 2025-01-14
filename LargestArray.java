package ArrayStringControlStatements;

import java.util.Scanner;
public class LargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];   //initialize array
        int i;
        System.out.println("Enter 5 numbers in array: ");
        for(i=0; i<5; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("The entered numbers are: ");
        for(i=0; i<5; i++){
            System.out.println(a[i]);
        }
        int max = a[0]; //initialize the maximun number
        for(i=0; i<5; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("The largest number in array: " + max);
        sc.close();
    }
}
