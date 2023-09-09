
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char symbol;
        System.out.println("choose symbol ");
        symbol = sc.next().charAt(0);

        System.out.println("enter a ");

        int a = sc.nextInt();
        System.out.println("enter b ");
        int b = sc.nextInt();

        switch (symbol) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;

            default:
                System.out.println("you  didn't correct operator");

        }

    }
}
