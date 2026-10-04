package topic07_strings;

/**
 * Let's build a mini text processing engine. Create a class named StringChallenge that performs the following tasks:
 * 1. Create a String variable containing a sentence of your choice (e.g., "Learning Java Core is Fun!").
 * 2. Print the length of the string.
 * 3. Check if the string contains the word "Java" using an if-else block and print an appropriate message.
 * 4. Use a StringBuilder to reverse the entire sentence and print the reversed result to the console screen. (Hint: StringBuilder has a built-in .reverse() method!)
 */
public class StringChallenge {
    public static void main(String[] args) {
        String text = "Learning Java Core is Fun!";
        System.out.println("Length of String is: " + text.length());
        if (text.contains("Java")) {
            System.out.println("Java is part of String content");
        } else {
            System.out.println("Java is not part of String content");
        }
        StringBuilder sb = new StringBuilder(text);
        System.out.println(sb.reverse());
    }
}
