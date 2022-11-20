import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, area, perimeter;
        final double PI = 22 / 7.0;
        System.out.print("Radius of Circle: ");
        r = sc.nextDouble();
        area = PI * r * r;
        perimeter = 2 * PI * r;
        System.out.print("Area of Circle: " + area + "\nPerimeter of Circle: " + perimeter);
        sc.close();
    }
}