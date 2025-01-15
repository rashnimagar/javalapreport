package Methodoverloading;


class Addition{
    //overloaded methods for addition
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    String add(String a, String b){
       return a+b;
    }
}
public class SameNameDifferentParameter {
    public static void main(String[] args) {
        Addition a= new Addition();
        System.out.println("Integer Addition: " + a.add(5,10));
        System.out.println("Double Addition: " + a.add(5.5,10.5));
        System.out.println("String Addition: " + a.add("Hello ","from method"));
    }
}
