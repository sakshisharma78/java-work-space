
import java.util.Scanner;

public class check {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a");

        int a = sc.nextInt();

        if (a > 0) {
            System.out.println("number is posiive:");
            if (a == 0)
                System.out.println("number is zero:");
        } else
            System.out.println("number is negative");

    }

}
