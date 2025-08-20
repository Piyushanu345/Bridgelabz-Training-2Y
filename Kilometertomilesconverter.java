package Level1;
import java.util.Scanner;

public class Kilometertomilesconverter{
    public static void main(String[] args) {
        // Declare a variable for kilometers
        double km;

        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();  // Read user input for km

        // Convert kilometers to miles (1 mile = 1.6 km)
        double miles = km / 1.6;

        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km.");

        // Close the scanner
        input.close();
    }
}
