import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sq, dup, p;
        System.out.print("Automorphic Numbers between 11 and 40: ");
        for (int num = 11; num <= 40; num++) {
            n = 0;
            sq = num * num;
            dup = num;
            while (dup > 0) {
                n++;
                dup /= 10;
            }
            p = (int) Math.pow(10, n);
            if (num == sq % p)
                System.out.println(num + " ");
        }
        sc.close();
    }
}