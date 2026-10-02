package topic05_oop;

/**
 * Let's build a payment processing template. Create a program utilizing an interface and an implementing class:
 * 1. PaymentProcessor Interface:
 * 	• Add a single abstract method signature: void processPayment(double amount);
 * 2. PayPalProcessor Class:
 * 	• Implement the PaymentProcessor interface.
 * 	• Inside the class, add a String email field and a constructor to initialize it.
 * 	• Provide the mandatory implementation for processPayment(double amount). It should print something like: "Processing PayPal payment of $[amount] using email: [email]".
 * 3. InterfaceChallenge Class (main method):
 * 	• Instantiate a PayPalProcessor using an email string.
 * 	• Call processPayment with a dummy value (e.g., 85.50)
 */
interface PaymentProcessor {
    void processPayment(double amount);
}
class PayPalProcessor implements PaymentProcessor {
    private String email;
    public PayPalProcessor(String email) {
        this.email = email;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount + " using email: " + this.email);
    }
}
public class InterfaceChallenge {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PayPalProcessor("test@gmail.com");
        paymentProcessor.processPayment(85.50);
    }
}
