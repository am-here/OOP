import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, max, min;
        System.out.print("Enter size of 1D Array: ");
        n = sc.nextInt();
        int A[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        max = A[0];
        min = A[0];
        for (int i = 0; i < n; i++) {
            if (A[i] > max)
                max = A[i];
            if (A[i] < min)
                min = A[i];
        }
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
        System.out.print("Enter size of 2D Array\nRows: ");
        m = sc.nextInt();
        System.out.print("Columns: ");
        n = sc.nextInt();
        int B[][] = new int[m][n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                B[i][j] = sc.nextInt();
        max = B[0][0];
        min = B[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (B[i][j] > max)
                    max = B[i][j];
                if (B[i][j] < min)
                    min = B[i][j];
            }
        }
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
        sc.close();
    }
}