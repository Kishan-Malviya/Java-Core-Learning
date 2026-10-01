package topic04_methods;

/**
 * Let's build a dedicated text utility class. Create a class named MethodChallenge containing the following methods:
 * 1. isEven method:
 * 	• Accepts an int number as a parameter.
 * 	• Returns a boolean value (true if the number is even, false if it is odd).
 * 2. greetUser method:
 * 	• Accepts a String name as a parameter.
 * 	• Returns nothing (void).
 * 	• Simply prints a message to the console like: "Welcome back, [name]!".
 * 3. main method:
 * 	• Call greetUser with your name.
 * 	• Call isEven inside an if statement to test a number (e.g., 14), and print whether it is even or odd based on the boolean result returned.
 */
public class MethodChallenge {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void greetUser(String name) {
        System.out.println("Welcome back, " + name + "!");
    }

    public static void main(String[] args) {
        greetUser("Kishan");

        if (isEven(11)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
