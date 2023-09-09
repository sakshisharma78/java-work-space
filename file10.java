
import java.util.*;

public class file10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n");
        int n = sc.nextInt();
        int lastdigit;

        lastdigit = n % 10;

        while (n > 10) {
            n = n / 10;

        }

        System.out.println(n);
        System.out.println(lastdigit);
        System.out.println(n + lastdigit);

    }

}
