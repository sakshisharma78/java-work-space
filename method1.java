import java.util.*;

public class method1 {

    double area_of_cir(int r) {

        double s = 3.14;
        double k = s * r * r;
        return (k);

    }

    void area_of_rect(int l, int b) {

        int f = l * b;
        System.out.println(f);

    }

    public static void main(String args[]) {
        method1 m = new method1();
        int a, t;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        t = sc.nextInt();

        double j = m.area_of_cir(5);
        System.out.println(j);

        m.area_of_rect(a, t);

    }

}
