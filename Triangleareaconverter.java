package Level2;
import java.util.Scanner;

public class Triangleareaconverter {
    public static void main(String[] args) {
        // Declare variables
        double baseInches, heightInches;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the base of the triangle (in inches): ");
        baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        heightInches = input.nextDouble();

        // Calculate area in square inches
        double areaInSqInches = 0.5 * baseInches * heightInches;

        // Convert area to square centimeters (1 inch = 2.54 cm => 1 sq inch = 6.4516 sq cm)
        double areaInSqCm = areaInSqInches * 6.4516;

        // Display the results
        System.out.println("The area of the triangle is " + areaInSqInches + " square inches and " 
                           + String.format("%.2f", areaInSqCm) + " square centimeters.");

        // Close scanner
        input.close();
    }
}
