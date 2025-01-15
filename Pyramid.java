package Methodoverloading;


class Star{
    void print(int n){
        System.out.println("Half pyramid: ");
        for(int i=0; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Pyramid {
    public static void main(String[] args) {
        //creating new object for Star class
        Star star = new Star();
        star.print(5);
    }
}
