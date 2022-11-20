import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P[] = new int[6];
        int Q[] = new int[4];
        int R[] = new int[10];
        int p = 0, q = 0, r = 0;
        System.out.print("Enter elements of array P: ");
        for (int i = 0; i < 6; i++)
            P[i] = sc.nextInt();
        System.out.print("Enter elements of array Q: ");
        for (int i = 0; i < 4; i++)
            Q[i] = sc.nextInt();
        while (p < 6 && q < 4) {
            if (P[p] < Q[q])
                R[r++] = P[p++];
            else
                R[r++] = Q[q++];
        }
        while (p < 6) {
            R[r++] = P[p++];
        }
        while (q < 4) {
            R[r++] = Q[q++];
        }
        System.out.print("Elements of the Resultant Array R: ");
        for (int i = 0; i < 10; i++)
            System.out.print(R[i] + " ");
        sc.close();
    }
}