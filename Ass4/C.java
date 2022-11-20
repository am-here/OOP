import java.util.*;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Enter Range\nStarting value: ");
        x = sc.nextInt();
        System.out.print("Ending value: ");
        y = sc.nextInt();
        System.out.print("Prime Numbers between " + x + " and " + y + ": ");
        for (int i = x; i <= y; i++) {
            if (i == 1)
                continue;
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.print(i + " ");
        }
        sc.close();
    }
}