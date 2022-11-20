import java.util.*;

class E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("How many friends do you have?\nAnswer: ");
        n = sc.nextInt();
        String names[] = new String[n];
        int values[] = new int[n];
        int max = 0;
        System.out.println("Enter the name of your Friends: ");
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            names[i] = s;
            int ans = 0;
            for (int j = 0; j < s.length(); j++) {
                ans += s.charAt(i);
            }
            values[i] = ans;
            if (max < values[i])
                max = values[i];
        }
        System.out.println("Friends with highest ascii values: ");
        for (int i = 0; i < n; i++) {
            if (values[i] == max)
                System.out.println(names[i]);
        }
        sc.close(); // not a mandatory line
    }
}