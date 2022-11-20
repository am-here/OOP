class A extends Thread {
    public static void main(String[] args) {
        A thread = new A();
        thread.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void run() {
        System.out.println();
    }
}