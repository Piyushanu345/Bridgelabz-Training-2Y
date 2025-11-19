
import java.util.*;

public class IsMultiple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (N % M == 0) {
            System.out.println("Yes, N is a multiple of M"); 
        }else {
            System.out.println("No, not a multiple");
        }
    }
}
