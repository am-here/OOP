import java.util.*;

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dup, reverse = 0, rem;
        System.out.print("Enter number: ");
        num = sc.nextInt();
        dup = num;
        while (dup > 0) {
            rem = dup % 10;
            reverse = reverse * 10 + rem;
            dup /= 10;
        }
        if (num == reverse)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
        sc.close();
    }
}