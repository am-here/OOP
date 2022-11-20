import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1, c;
        System.out.print("Enter number of terms: ");
        n = sc.nextInt();
        System.out.print("Fibbonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}