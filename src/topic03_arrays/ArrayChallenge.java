package topic03_arrays;

/**
 * Let's manage an inventory array. Create a class named ArrayChallenge that processes the following:
 * 1. Create a double array named prices containing these values: 19.99, 4.50, 29.99, 120.00, 5.00.
 * 2. Use an enhanced for loop (for-each) to iterate through the array.
 * 3. Calculate two separate things during iteration:
 * 	• The sum total of all item prices combined.
 * 	• The number of items that cost more than 25.00 (count them using a tracking variable).
 * 4. Print out both calculated results at the end.
 */
public class ArrayChallenge {
    public static void main(String[] args) {
        double[] prices = {19.99, 4.50, 29.99, 120.00, 5.00};
        double sum = 0;
        int itemCount = 0;

        // Enhanced for (for-each) loop
        for (double price : prices) {
            sum += price;
            if (price > 25.00) {
                itemCount += 1;
            }
        }

        System.out.println("The sum total of all item prices combined is: " + sum);
        System.out.println("The number of items that cost more than 25.00 is: " + itemCount);
    }
}
