import java.util.Scanner;

class ThreadClass extends Thread {
    int a, b;

    ThreadClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        int c, d;
        c = a;
        d = b;
        try {
            sleep(500);
        } catch (Exception e) {
        }
        System.out.println("Addition of a and b: " + (c + d));
    }

    void increase() {
        a += 5;
        b += 5;
        try {
            sleep(500);
        } catch (Exception e) {
        }
        System.out.println("Value: a = " + a + " and b = " + b);
    }
}

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        ThreadClass t1 = new ThreadClass(a, b);
        ThreadClass t2 = new ThreadClass(a, b);
        t1.add();
        t2.increase();
        sc.close();
    }
}