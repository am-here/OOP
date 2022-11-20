
import java.util.*;

class H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Input: ");
        s = sc.next();
        int i = (s.length() - 3) / 2;
        System.out.println("Output: " + s.substring(i, i + 3));
        String s1, s2;
        System.out.print("String 1: ");
        s1 = sc.next();
        System.out.print("String 2: ");
        s2 = sc.next();
        String ans = s1.substring(0, s1.length() / 2) + s2 + s1.substring(s1.length() / 2);
        System.out.println("Output: " + ans);
        sc.close();
    }
}