package topic02_operators_and_control_flow;

/**
 * Let's build a quick E-Commerce Discount Calculator.
 * Write a class named DiscountCalculator that does the following:
 * 1. Create a variable for totalBill (a decimal value, e.g., 150.0).
 * 2. Create a boolean variable isMember (set it to true or false).
 * 3. Apply the following rules using if-else:
 *      - If totalBill is greater than 100 AND the customer is a member, give them a 20% discount.
 *      - Otherwise, if totalBill is greater than 100 but they are not a member, give them a 10% discount.
 *      - Otherwise, no discount is applied.
 * 4. Calculate and print the final price after the discount.
 */
public class DiscountCalculatorChallenge {
    public static void main(String[] args) {
        float totalBill = 150.0f;
        boolean isMember = true;
        if (totalBill > 100) {
            if (isMember) {
                System.out.println("Final Price after the discount - " + (totalBill - (totalBill * 20 / 100)));
            } else {
                System.out.println("Final Price after the discount - " + (totalBill - (totalBill * 10 / 100)));
            }
        } else {
            System.out.println("Final Price - " + totalBill);
        }
    }
}
