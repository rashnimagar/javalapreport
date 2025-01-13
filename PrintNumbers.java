package StructureOfJava;

public class PrintNumbers {
    public static void main(String[] args){
        int i;
        System.out.println("Printing the numbers from 1 to 10 until 5 is found: ");
        for(i=1; i<=10; i++){
            if(i == 5){
                System.out.println("Number 5 found, stopping the loop.");
                break;
            }
             System.out.println(i);
        }
    }
}
