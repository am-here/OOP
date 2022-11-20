package Ass12_Package;

interface addmul {
    default void add() {
    };

    default void show() {
    };
}

public class A_package implements addmul {
    public void add(int a, int b) {
        show(a + b);
    }

    public void show(int ans) {
        System.out.println(ans);
    }

    public void add(double a, double b) {
        show(a + b);
    }

    public void show(double ans) {
        System.out.println(ans);
    }

    public void add(String a, String b) {
        show(a + b);
    }

    public void show(String ans) {
        System.out.println(ans);
    }
};