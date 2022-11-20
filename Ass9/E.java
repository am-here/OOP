import java.util.*;

abstract class Shape {
    int a;
    int b;

    void printArea() {
    };
}

class Rectangle extends Shape {
    void printArea(int length, int breath) {
        System.out.print(length * breath);
    }
}

class Triangle extends Shape {
    void printArea(int base, int height) {
        System.out.print(base * height / 2.0);
    }
}

class Circle extends Shape {
    void printArea(int radius) {
        System.out.print(22 / 7.0 * radius * radius);
    }
}

class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter length of Rectangle: ");
        a = sc.nextInt();
        System.out.print("Enter breath of Rectangle: ");
        b = sc.nextInt();
        Rectangle obj1 = new Rectangle();
        System.out.print("Area of Rectangle: ");
        obj1.printArea(a, b);
        System.out.print("Enter base of Triangle: ");
        a = sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        b = sc.nextInt();
        Triangle obj2 = new Triangle();
        System.out.print("Area of Triangle: ");
        obj2.printArea(a, b);
        System.out.print("Enter radius of Circle: ");
        a = sc.nextInt();
        Circle obj3 = new Circle();
        System.out.print("Area of Circle: ");
        obj3.printArea(a);
        sc.close();

    }
}