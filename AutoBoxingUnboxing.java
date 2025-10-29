
import java.util.*;

class AutoBoxingUnboxing {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Auto-boxing (int → Integer automatically)
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int sum = 0;
        // Auto-unboxing (Integer → int automatically)
        for (int n : list) {
            sum += n;
        }

        System.out.println("Sum of numbers = " + sum);
    }
}
