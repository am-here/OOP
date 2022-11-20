import java.util.*;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Input: ");
        s = sc.next();
        int a = s.indexOf("@");
        int b = s.indexOf(".", a);
        System.out.println("Output: " + s.substring(a + 1, b));
        sc.close();
    }
}