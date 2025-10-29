
import java.util.*;

class PrimitiveToWrapper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt(); // primitive

        // Convert primitive to wrapper
        Integer objNum = Integer.valueOf(num);

        System.out.println("Primitive value: " + num);
        System.out.println("Wrapper object value: " + objNum);
    }
}
