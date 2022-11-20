import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, n, sp, c;
        System.out.print("Enter choice(1,2 or 3): ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter number of lines: ");
                n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;
            case 2:
                System.out.print("Enter number of lines: ");
                n = sc.nextInt();
                sp = (n - 1) * 2;
                c = 0;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= sp; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i; j++) {
                        c %= 26;
                        System.out.print((char) (c + 65) + "   ");
                        c++;
                    }
                    System.out.println();
                    sp -= 2;
                }
                break;
            case 3:
                System.out.print("Enter number of lines: ");
                n = sc.nextInt();
                sp = (n - 1) * 2;
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= sp; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i; j++)
                        System.out.print(j + " ");
                    System.out.println();
                    sp -= 2;
                }
                break;
            default:
                System.out.println("Invalid Input");

        }
        sc.close();
    }
}