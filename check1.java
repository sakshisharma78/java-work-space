import java.util.Scanner;

public class check1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a");

        int a = sc.nextInt();

        if (a % 2 == 0)
            System.out.println("number is even");
        else
            System.out.println("odd number");

    }

}
