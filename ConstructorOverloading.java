package Methodoverloading;


class Rectangle{
    double length;
    double width;
    //constructor to initialize both length and width
   public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    //constructor to initialize a square(length = width)
    public Rectangle(double side){
        this.length = side;
        this.width = side;
    }
    //method to calculate area
    double area(){
        return length*width;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        //creating new objects using different constructor
        Rectangle rect = new Rectangle(5,4);
        Rectangle square = new Rectangle(5);
        System.out.println("Area of rectangle: " + rect.area());
        System.out.println("Area of square: " + square.area()); 
    }
}
