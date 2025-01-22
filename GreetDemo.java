//Custom package
// File: greeting/Greet.java
package myPackages;

public class Greet {
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}


//main file
// File: greeting/GreetDemo.java
package myPackageFiles;

import myPackages.Greet;
import java.util.Scanner;

public class GreetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Greet greet = new Greet();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        greet.greetUser(name);
        sc.close();
    }
}
