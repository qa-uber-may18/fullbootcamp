
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a + " " + b);

        int n;
        for (int i = 1; i <= 20; i++) {
            n = a + b;
            System.out.print(" " + n);
            a = b;
            b = n;

        }
    }
}
