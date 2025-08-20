package Level2;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Declare variables
        double number1, number2;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division;

        // Handle division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            division = Double.NaN; // Not a Number if division by zero
        }

        // Display the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        // Close the scanner
        input.close();
    }
}
