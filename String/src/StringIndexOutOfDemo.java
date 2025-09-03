import java.util.Scanner;

public class StringIndexOutOfDemo {

    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 1)); // invalid index
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        // generateException(text); // crashes
        handleException(text);

        sc.close();
    }
}
