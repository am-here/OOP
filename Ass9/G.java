import java.util.Scanner;

interface MeanInterface {
    default double mean(int A[]) {
        double sum = 0.0;
        for (int i : A)
            sum += i;
        double M = sum / A.length;
        return M;
    }
}

interface DeviationInterface extends MeanInterface {
    default double devaiation(int A[]) {
        double sum = 0.0;
        double M = mean(A);
        for (int i : A)
            sum += Math.abs(i - M);
        double D = sum / A.length;
        return D;
    }
}

class Call implements DeviationInterface {
    void print(int A[]) {
        System.out.println("Mean of the Array: " + mean(A));
        System.out.println("Deviation of the Array: " + devaiation(A));
    }
}

class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        Call obj = new Call();
        obj.print(A);
        sc.close();
    }
}