package ClassesConstructor;

class Car{
    String model;
    int year;
    //constructor
    public Car(String model, int year){
        this.model=model;
        this.year=year;
    }
    public void display(){
        System.out.println("Car model: " + model);
        System.out.println("Year: " + year);
    }
}
public class SimpleClass {
    public static void main(String[] args) {
        //creating an oject using constructor
        Car car = new Car("Toyota", 1995);
        car.display();
    }
}
