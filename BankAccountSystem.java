package ClassesConstructor;

class BankAccount{
    String accountHolderName;
    double balance;

    //constructor to initialie the account
    public BankAccount(String accountHolderName, double initialBalance){
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    //method to deposit money
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    //method to withdraw money
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn: "+ amount);
        }
        else{
            System.out.println("Insufficient balance.");
        }
    }
    public void display(){
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Yasodha", 2500);
        account.deposit(500);
        account.withdraw(1000);
        account.display();
    }
}
