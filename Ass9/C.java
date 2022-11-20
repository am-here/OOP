import java.util.*;

abstract class _2Dfigure {
    int a, b;

    _2Dfigure(int x, int y) {
        a = x;
        b = y;
    }

    abstract int calculateArea();
}

class Rectangle extends _2Dfigure {
    Rectangle(int length, int breath) {
        super(length, breath);
    }

    int calculateArea() {
        return a * b;
    }
}

class Triangle extends _2Dfigure {
    Triangle(int base, int height) {
        super(base, height);
    }

    int calculateArea() {
        return a * b / 2;
    }
}

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Find area of Rectangle:\nEnter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breath: ");
        int breath = sc.nextInt();
        _2Dfigure R = new Rectangle(length, breath);
        System.out.println("Area of Rectangle: " + R.calculateArea());
        System.out.print("Find area of Triangle:\nEnter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Height: ");
        int height = sc.nextInt();
        _2Dfigure T = new Triangle(base, height);
        System.out.println("Area of Triangle: " + T.calculateArea());
        sc.close();
    }
}
