
import java.util.*;

public class CountOdd5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            if (x % 2 != 0) {
                count++;
            }
        }

        System.out.println("Odd count = " + count);
    }
}
