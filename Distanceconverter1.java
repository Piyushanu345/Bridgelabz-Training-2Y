package Level1;
import java.util.Scanner;

public class Distanceconverter1 {
    public static void main(String[] args) {
        // Declare variable for input
        double distanceInFeet;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take distance input in feet
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / 1760;

        // Output the result
        System.out.println("The distance is " + distanceInFeet + " feet, which is " 
            + String.format("%.2f", distanceInYards) + " yards and " 
            + String.format("%.5f", distanceInMiles) + " miles.");

        // Close the scanner
        input.close();
    }
}
