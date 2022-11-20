import java.util.*;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, fact, sum, dup;
        System.out.print("Special Numbers between 100 and 999: ");
        for (int num = 100; num <= 999; num++) {
            dup = num;
            sum = 0;
            while (dup > 0) {
                rem = dup % 10;
                fact = 1;
                for (int i = 1; i <= rem; i++)
                    fact *= i;
                sum += fact;
                dup /= 10;
            }
            if (num == sum)
                System.out.println(num + " ");
        }
        sc.close();
    }
}