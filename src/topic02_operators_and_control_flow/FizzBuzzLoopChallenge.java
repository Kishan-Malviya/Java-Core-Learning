package topic02_operators_and_control_flow;

/**
 * Write a class named FizzBuzzLoopChallenge that does the following:
 * 1. Write a for loop that counts from 1 to 20.
 * 2. Inside the loop, apply these rules:
 * 	• If the number is divisible by 3, print "Fizz" instead of the number.
 * 	• If the number is divisible by 5, print "Buzz" instead of the number.
 * 	• If the number is divisible by both 3 and 5, print "FizzBuzz".
 * 	• Otherwise, just print the number itself.
 * Hint: Use the modulus operator % to check divisibility (e.g., i % 3 == 0). Check for the combined "FizzBuzz" condition first!
 */
public class FizzBuzzLoopChallenge {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
