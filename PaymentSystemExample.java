package OOPsPrinciples;

//demonstrating payment system example using polymorphism
interface Payment{
    void processPayment(double amount);
}
class CreditCard implements Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing credit card payment of $" + amount);
    }
}
class Paypal implements Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Processing Paypal payment of $" + amount);
    }
}
class PaymentProcessor{
    void process(Payment paymentMethod, double amount){
        paymentMethod.processPayment(amount);
    }
}
public class PaymentSystemExample {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.process(new CreditCard(), 150); //output: processing credit card payment
        processor.process(new Paypal(), 200); //Output: Processing Paypal amunt
    }
}
