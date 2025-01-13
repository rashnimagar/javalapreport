package ClassesConstructor;

class Rectangle{
    double length;
    double breadth;

    //default constructor with default values
    public Rectangle(){
        this.length = 10.0;
        this.breadth = 5.0;
    }
    //parameteried constructor to set custom values
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    //method to calculate area
    public double Area(){
        return length*breadth;
    }
}
public class RectangleArea {
    public static void main(String[] args) {
        //using default constructor
        Rectangle defaultRect = new Rectangle();
        System.out.println("Area of default rectangle: " + defaultRect.Area());
        //using parameteried constructor
        Rectangle customRect = new Rectangle(10.5, 25);
        System.out.println("Area of custom rectangke: " + customRect.Area());

    }
}
