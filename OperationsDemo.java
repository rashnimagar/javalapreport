//Custom package
package myPackages;
// File: numberoperations/MathOperations.java

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}


//Main file which imports custom package

// File: numberoperations/OperationsDemo.java
import myPackages.MathOperations;

public class OperationsDemo {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        int num1 = 10, num2 = 5;
        System.out.println("Sum: " + mathOps.add(num1, num2));
        System.out.println("Difference: " + mathOps.subtract(num1, num2));
        System.out.println("Product: " + mathOps.multiply(num1, num2));
    }
}
