import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Input: ");
        s = sc.next();
        int n = s.length();
        String arr[] = new String[10];
        int k = 0;
        String str = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ',') {
                arr[k++] = str;
                str = "";
            } else {
                str += s.charAt(i);
            }
        }
        arr[k++] = str;
        System.out.print("Output: ");
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            if (i == 0)
                System.out.print(arr[i]);
            else
                System.out.print("," + arr[i]);
        }
        sc.close();
    }
}