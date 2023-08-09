
import java.util.Scanner;

public class file6 {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n;");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = i * fact;

        }
        System.out.println(fact);

    }

}
