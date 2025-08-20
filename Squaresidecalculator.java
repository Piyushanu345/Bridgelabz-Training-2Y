package Level2;
import java.util.Scanner;

public class Squaresidecalculator {
    public static void main(String[] args) {
        // Declare variable for perimeter
        double perimeter;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate side
        double side = perimeter / 4;

        // Output the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        // Close the scanner
        input.close();
    }
}
