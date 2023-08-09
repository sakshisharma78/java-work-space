import java.util.Scanner;

public class scanner_class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        byte b = sc.nextByte();
        long c = sc.nextLong();
        short d = sc.nextShort();
        boolean e = sc.nextBoolean();
        float f = sc.nextFloat();
        double g = sc.nextDouble();
        String h = sc.nextLine();
        String r = sc.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        System.out.println(g);
        System.out.println(h);
        System.out.println(r);

    }

}
