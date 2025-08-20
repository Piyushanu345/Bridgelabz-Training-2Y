package Level2;
import java.util.Scanner;

public class TotalPriceCalculator1 {
    public static void main(String[] args) {
        // Declare variables
        double unitPrice;
        int quantity;

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the unit price (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice + 
            " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        // Close the scanner
        input.close();
    }
}
