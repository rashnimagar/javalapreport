package DataTypesVariabesOperators;

import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        float sum = 0;
        float[] a = new float[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextFloat();
            sum = sum + a[i];
        }
        float average = sum/n;
        System.out.println("The average: " + average);
        sc.close();
    }
}
