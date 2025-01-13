package StructureOfJava;

import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle in cm: ");
        double radius = sc.nextDouble();
        double result = 3.14*radius*radius;
        System.out.println("Area of circle: " + result);
        sc.close();
    }
}
