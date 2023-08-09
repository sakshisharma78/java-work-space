import java.util.Scanner;

public class file9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean f;
        for (int i = 2; i <= 10; i++) {
            if (n % i == 0) {
                f = false;
                break;

            } else {
                f = true;
            }

        }
        if (f != true)
            System.out.println("number is not prime");
        else
            System.out.println("number is  prime");

    }
}
