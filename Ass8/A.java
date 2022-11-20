import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Input: ");
        s = sc.nextLine();
        s = " " + s;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                s = s.substring(0, i + 1) + s.substring(i + 1, i + 2).toUpperCase() + s.substring(i + 2);
            }
        }
        System.out.println("Output: " + s.substring(1));
        System.out.println("Word\tVowels\tConsonants");
        String str = "";
        int v = 0, c = 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(str + "\t" + v + "\t" + c);
                str = "";
                v = 0;
                c = 0;
            } else {
                str += s.charAt(i);
                if (s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
                        s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
                        s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
                        s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
                        s.charAt(i) == 'u' || s.charAt(i) == 'U')
                    v++;
                else
                    c++;
            }
        }
        System.out.println(str + "\t" + v + "\t" + c);
        sc.close();
    }
}