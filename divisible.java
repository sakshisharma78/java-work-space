import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a");

        int a = sc.nextInt();

        if (a % 5 == 0 && a % 11 == 0)
            System.out.println("number is divisible");
        else
            System.out.println("not divisible");

    }

}
