package Level1;
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Declare variable for height in cm
        double heightCm;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Output the result
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));

        // Close scanner
        input.close();
    }
}
