
import java.util.*;

public class file6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("enter n");
        // int n = sc.nextInt();
        int n = 1;
        int sum = 0;

        while (n <= 100)

        {
            if (n % 2 != 0)
                sum += n;
            n++;

        }
        System.out.println(sum);

    }

}
