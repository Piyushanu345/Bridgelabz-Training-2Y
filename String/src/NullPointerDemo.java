public class NullPointerDemo {

    // Method that generates NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // causes NullPointerException
    }

    // Method with try-catch to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
