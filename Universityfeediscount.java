package Level1;
import java.util.Scanner;

public class Universityfeediscount {
    public static void main(String[] args) {
        // Declare variables
        double fee;
        double discountPercent;

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();

        // Take user input for discount percentage
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate final fee after discount
        double finalFee = fee - discount;

        // Print the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        // Close the scanner
        input.close();
    }
}
