package Level2;
import java.util.Scanner;

public class Doubleoptprogram{
    public static void main(String[] args) {
        // Declare double variables
        double a, b, c;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter double a: ");
        a = input.nextDouble();

        System.out.print("Enter double b: ");
        b = input.nextDouble();

        System.out.print("Enter double c: ");
        c = input.nextDouble();

        // Perform operations (operator precedence applies)
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c; // modulus operator works with doubles in Java  (remainder)

        // Print the results with formatting
        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n",
                          result1, result2, result3, result4);

        // Close scanner
        input.close();
    }
}
