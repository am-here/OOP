class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
            try {
                if (i == 6)
                    sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}

class A {
    public static void main(String[] args) {
        new T1().start();
        new T2().start();
    }
}