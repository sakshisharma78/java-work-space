import java.util.Scanner;

public class check2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a");

        char A = sc.next().charAt(0);

        if (A == 'a' || A == 'e' || A == 'i' || A == 'O' || A == 'U')
            System.out.println("char is alphabet");
        else
            System.out.println("char is conssonant");

    }
}
