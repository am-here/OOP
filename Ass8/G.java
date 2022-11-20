import java.util.*;

class G {
    static boolean wellbracketed(String s) {
        int depth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                depth++;
            if (s.charAt(i) == ')')
                depth--;
            if (depth < 0)
                return false;
        }
        return (depth == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        char ch;
        do {
            System.out.print("Input: ");
            s = sc.next();
            System.out.println("Output: " + wellbracketed(s));
            System.out.println("Do you want to continue?(Y/N): ");
            ch = sc.next().charAt(0);
        } while (ch == 'Y');
        sc.close();
    }
}