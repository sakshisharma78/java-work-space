
public class test {

    int a, b;

    test() {
        a = 10;
        b = 20;
    }

    test(int x, int y) {
        a = x;
        b = y;

    }

    test(test c1) {
        a = c1.a;
        b = c1.b;
    }

    void display() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        test c = new test();
        test c2 = new test();
        test c4 = new test(30, 40);
        c.display();
        c2.display();
        c4.display();

    }

}