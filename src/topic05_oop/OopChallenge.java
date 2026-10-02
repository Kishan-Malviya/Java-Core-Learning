package topic05_oop;

/**
 * Let's build a digital wallet object tracking system. Create a program utilizing two separate classes
 * (either in separate files or within the same package):
 * 1. BankAccount Class (The Blueprint):
 * 	• Add a String accountHolder field.
 * 	• Add a double balance field.
 * 	• Add an instance method deposit(double amount) that increases the balance field by that amount and prints the update.
 * 2. OopChallenge Class (Contains main method):
 * 	• Inside the main method, create an instance of BankAccount.
 * 	• Set the accountHolder to your name and give it an initial balance of 500.0.
 * 	• Call the deposit method with an amount of 150.0 to verify the state change.
 */
class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Updated Balance is: " + this.balance);
    }
}

public class OopChallenge {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHolder = "Kishan";
        bankAccount.balance = 500.0;
        bankAccount.deposit(150.0);
    }
}
