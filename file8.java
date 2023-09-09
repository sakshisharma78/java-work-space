
import java.util.*;

public class file8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n");
        int n = sc.nextInt();
        int t = 0;

        while (n != 0) {
            n /= 10;
            ++t;
        }
        System.out.println(t);

    }

}
