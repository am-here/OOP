import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, n, y = 1;
        System.out.print("Enter value of x: ");
        x = sc.nextInt();
        System.out.print("Enter value of n: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++)
            y *= x;
        System.out.print("x^n = " + y);
        sc.close();
    }
}