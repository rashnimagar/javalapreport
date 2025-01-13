package ClassesConstructor;

import java.util.Scanner;

class Student{
    private String name;
    private String course;
    private String number;
    private int age;
    
    //constructor that takes user input
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = sc.nextLine();
        System.out.println("Enter your course: ");
        this.course = sc.nextLine();
        System.out.println("Enter your number: ");
        this.number = sc.nextLine();
        System.out.println("Enter your age: ");
        this.age = sc.nextInt();
        sc.close();
    }

    //method to display the students information
    public void display(){
        System.out.println("Student's name: " + name);
        System.out.println("Student's course: " + course);
        System.out.println("Student's phone number: " + number);
        System.out.println("Student's age: " + age);
    }
}
public class UserInput {
    public static void main(String[] args) {
        //creating a new Person object, which will promptfor input
        Student student = new Student();
        student.display();
    }
}
