import java.util.*;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, n, temp;
        System.out.print("Enter value of n: ");
        n = sc.nextInt();
        int A[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.println("Sort using following techniques\n1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort");
        System.out.print("Enter choice(1,2 or 3): ");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j < (n - i); j++) {
                        if (A[j - 1] > A[j]) {
                            temp = A[j - 1];
                            A[j - 1] = A[j];
                            A[j] = temp;
                        }

                    }
                }
                break;
            case 2:
                for (int i = 0; i < A.length - 1; i++) {
                    int x = i;
                    for (int j = i + 1; j < A.length; j++)
                        if (A[j] < A[x])
                            x = j;
                    temp = A[x];
                    A[x] = A[i];
                    A[i] = temp;
                }
                break;
            case 3:
                for (int i = 1; i < n; i++) {
                    temp = A[i];
                    int j = i - 1;
                    while (j >= 0 && temp <= A[j])
                        A[j + 1] = A[j--];
                    A[j + 1] = temp;
                }
                break;
            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        sc.close();
    }
}