package topic06_exception_handling;

/**
 * Let's build a safe element locator system. Create a class named ExceptionChallenge that performs the following:
 * 1. Create a String[] names = {"Alice", "Bob", "Charlie"}; array inside your main method.
 * 2. Set up a try-catch-finally block structure.
 * 3. Inside the try block, attempt to read and print an element out of bounds, such as index 5: System.out.println(names[5]);.
 * 4. Catch the specific exception: ArrayIndexOutOfBoundsException. Print an informative user-friendly error message.
 * 5. In the finally block, print: "Execution attempt complete."
 */
public class ExceptionChallenge {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Error accessing array element at index 5");
        } finally {
            System.out.println("Execution attempt complete.");
        }
    }
}
