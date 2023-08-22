import java.util.*;

public class method2 {

    static double area_of_cir(int r) {

        double s = 3.14;
        double k = s * r * r;
        return (k);

    }

    static void area_of_rect(int l, int b) {

        int f = l * b;
        System.out.println(f);

    }

    public static void main(String args[]) {

        int a, t;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        t = sc.nextInt();

        double j = area_of_cir(5);
        System.out.println(j);

        area_of_rect(a, t);

    }

}
