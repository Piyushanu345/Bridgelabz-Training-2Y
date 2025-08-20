package Level1;
import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        // Declare variable for number of students
        int numberOfStudents;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes
        int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the result
        System.out.println("The maximum number of possible handshakes is: " + totalHandshakes);

        // Close the scanner
        input.close();
    }
}
