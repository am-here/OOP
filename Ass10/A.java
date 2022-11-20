import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Input: ");
        a = sc.nextInt();
        b = sc.nextInt();
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
            System.out.println("Error: " + e);
        }
        sc.close();
    }
}