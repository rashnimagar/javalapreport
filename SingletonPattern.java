package OOPsPrinciples;

class Singleton{
    private static Singleton instance;
    private Singleton() {
        //private constructor to prevent instantiation
    }
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public void display(){
        System.out.println("Singleton instance accessed.");
    }
}
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.display();
    }
}
