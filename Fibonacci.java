
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese hasta que posición quiere conocer de la serie Fibonacci");
        n = sc.nextInt();
        bFibonacci(n);
    }

    public static void bFibonacci(int n) {
        int a = 1;
        int b = 1;
        int cal = 1;
        System.out.println("El número en la posición 1 es 0");
        System.out.println("El número en la posición 2 es 1");
        for (int i = 3; i < n; i++) {
            System.out.println("El número en la posición " + (i) + " es " + cal);
            cal = a + b;
            b = a;
            a = cal;
        }
        System.out.println("El número en la posición que pido " + n + " es : " + cal);

    }
}
