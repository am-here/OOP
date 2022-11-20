import java.util.Scanner;

class Mathexception extends Exception {
    Mathexception(String ans) {
        System.out.println(ans);
    }
}

class OverflowException extends Mathexception {
    OverflowException() {
        super("Overflowexception");
    }
}

class UnderflowException extends Mathexception {
    UnderflowException() {
        super("Underflowexception");
    }
}

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        try {
            if (n > 100) {
                throw new OverflowException();
            }
            if (n < 100) {
                throw new UnderflowException();
            }
        } catch (Mathexception M) {
            try {
                throw M;
            } catch (OverflowException O) {
                System.out.println("OVERFLOW");
            } catch (UnderflowException U) {
                System.out.println("UNDERFLOW");
            }
        } finally {
            System.out.println("Value of n: " + n);
        }
        sc.close();
    }
}