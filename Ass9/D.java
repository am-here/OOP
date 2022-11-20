import java.util.*;

abstract class GeometricObject {
    String color;
    double weight;

    GeometricObject() {
        color = "White";
        weight = 1.0;
    }

    String getColor() {
        return color;
    }

    double getWeight() {
        return weight;
    }

    abstract double findArea(int base, int height);

    abstract int findCircumference(int a, int b, int c);
}

class Triangle extends GeometricObject {
    Triangle() {
        super();
    }

    double findArea(int base, int height) {
        return base * height / 2.0;
    }

    int findCircumference(int a, int b, int c) {
        return a + b + c;
    }
}

class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b, h, a, c;
        Triangle obj = new Triangle();
        System.out.println("The color of the Triangle: " + obj.getColor());
        System.out.println("The weight of the Triangle: " + obj.getWeight());
        System.out.print("Enter base of Triangle: ");
        b = sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        h = sc.nextInt();
        System.out.println("The area of the Triangle: " + obj.findArea(b, h));
        System.out.print("Enter sides of Triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("The circumference of the Triangle: " + obj.findCircumference(a, b, c));
        sc.close();

    }
}