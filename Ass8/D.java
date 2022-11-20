import java.util.*;

class D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Input: ");
        s = sc.nextLine();
        int n = s.length();
        int words = 0;
        System.out.println("POTENTIAL: ");
        s += " ";
        String str = "";
        String S[] = new String[10];
        int P[] = new int[10];
        for (int i = 0; i <= n; i++) {
            if (s.charAt(i) == ' ') {
                S[words] = str;
                int ans = 0;
                for (int j = 0; j < str.length(); j++) {
                    ans += str.charAt(j) - 64;
                }
                P[words] = ans;
                System.out.println(str + " = " + P[words]);
                words++;
                str = "";
            } else
                str += s.charAt(i);
        }
        System.out.print("Output: ");
        for (int i = 0; i < words; i++) {
            for (int j = i + 1; j < words; j++) {
                if (P[i] > P[j]) {
                    int t = P[i];
                    P[i] = P[j];
                    P[j] = t;
                    String temp = S[i];
                    S[i] = S[j];
                    S[j] = temp;
                }
            }
        }
        for (int i = 0; i < words; i++) {
            System.out.print(S[i] + " ");
        }
        sc.close(); // not a mandatory line
    }
}