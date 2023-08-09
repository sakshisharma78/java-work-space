import java.util.*;

public class file8 {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter n");

        int n = Sc.nextInt();

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum += Math.pow(temp, n);
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("armstrong number ");
        else
            System.out.println("not armstrong");
    }
}