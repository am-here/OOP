import java.util.*;

class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Input - ");
        s = sc.next();
        System.out.print("Output - ");
        for (int i = 0; i < s.length(); i++) {
            if (i == 0)
                System.out.print(s.charAt(i));
            else {
                if (s.charAt(i) == s.charAt(i - 1))
                    continue;
                System.out.print(s.charAt(i));
            }
        }
        sc.close();
    }
}