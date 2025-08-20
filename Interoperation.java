package Level2;
import java.util.Scanner;

public class Interoperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Performing operations
        int result1 = a + b * c;       // Multiplication happens before addition
        int result2 = a * b + c;       // Multiplication before addition
        int result3 = c + a / b;       // Division before addition
        int result4 = a % b + c;       // Modulus before addition

        // Displaying results
        System.out.println(
            "The results of Int Operations are:\n" +
            "a + b * c = " + result1 + "\n" +
            "a * b + c = " + result2 + "\n" +
            "c + a / b = " + result3 + "\n" +
            "a % b + c = " + result4
        );
    }
}
