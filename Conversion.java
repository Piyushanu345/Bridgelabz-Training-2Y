import java.util.Scanner;

public class Conversion{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to the Kilometer to Miles Converter!");

        // Get distance in kilometers from the user
        System.out.print("Please enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Conversion formula
        double miles = kilometers * 0.621371;

        // Display result
        System.out.printf("%.2f kilometers is equal to %.2f miles.\n", kilometers, miles);
    }
}
