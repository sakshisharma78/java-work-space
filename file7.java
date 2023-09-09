
import java.util.*;

public class file7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n");
        int n = sc.nextInt();
        int t = 0;

        for (int i = 1; i <= 10; i++) {
            t = n * i;
            System.out.println(n + "*" + i + "=" + t);

        }

    }

}
