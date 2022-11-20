import java.util.*;

class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, dup, sum, rem;
        System.out.print("Enter Range\nStarting value: ");
        x = sc.nextInt();
        System.out.print("Ending value: ");
        y = sc.nextInt();
        System.out.print("Magic Numbers between " + x + " and " + y + ": ");
        for (int num = x; num <= y; num++) {
            dup = num;
            while (dup > 9) {
                sum = 0;
                while (dup != 0) {
                    rem = dup % 10;
                    sum += rem;
                    dup /= 10;
                }
                dup = sum;
            }
            if (dup == 1)
                System.out.print(num + " ");
        }
        sc.close();
    }
}