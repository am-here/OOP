import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d;
        System.out.print("General Quadratic Equation: ax^2+bx+c=0\nEnter value of a: ");
        a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        c = sc.nextDouble();
        d = b * b - 4.0 * a * c;
        if (d == 0) {
            System.out.println("Roots are equal");
            double root = -b / (2.0 * a);
            System.out.println("Root of the equation is: " + root);
        } else if (d > 0) {
            System.out.println("Roots are real and distinct");
            double root1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("Roots of the equation are: " + root1 + " and " + root2);
        } else {
            System.out.println("Roots are imaginary and distinct");
            double r_root = (-b) / (2.0 * a);
            double i_root = Math.sqrt(-d) / (2.0 * a);
            System.out.println(
                    "Roots of the equation are: " + r_root + " + " + i_root + "i and " + r_root + " - " + i_root + "i");
        }
        sc.close();
    }
}