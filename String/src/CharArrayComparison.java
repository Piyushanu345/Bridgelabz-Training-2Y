import java.util.Scanner;

public class CharArrayComparison {
    // Custom method to convert string to char array
    public static char[] customToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] customArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Custom array: " + new String(customArray));
        System.out.println("Built-in array: " + new String(builtInArray));

        if (compareCharArrays(customArray, builtInArray)) {
            System.out.println("✅ Both char arrays are equal.");
        } else {
            System.out.println("❌ Char arrays do not match.");
        }

        sc.close();
    }
}
