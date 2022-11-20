import java.util.*;

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, n, key, i;
        boolean found;
        System.out.print("Enter value of n: ");
        n = sc.nextInt();
        int A[] = new int[n];
        System.out.print("Enter elements in sorted way fo binary search: ");
        for (i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.println("Search using following techniques\n1. Linear Search\n2. Binary Search");
        System.out.print("Enter choice(1 or 2): ");
        ch = sc.nextInt();
        System.out.print("Enter element to find: ");
        key = sc.nextInt();
        switch (ch) {
            case 1:
                found = false;
                for (i = 0; i < n; i++) {
                    if (A[i] == key) {
                        found = true;
                        break;
                    }
                }
                if (found)
                    System.out.println("Element found at index " + i);
                else
                    System.out.println("Element not found");
                break;
            case 2:
                found = false;
                int l = 0, h = n - 1, mid = 0;
                while (l <= h) {
                    mid = (l + h) / 2;
                    if (A[mid] == key) {
                        found = true;
                        break;
                    } else if (A[mid] > key)
                        h = mid - 1;
                    else
                        l = mid + 1;
                }

                if (found)
                    System.out.println("Element found at index " + mid);
                else
                    System.out.println("Element not found");
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}