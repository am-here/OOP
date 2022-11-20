interface M_Inheritence1 {
    default void print1() {
        System.out.println("Hello world");
    }
}

interface M_Inheritence2 {
    default void print2() {
        System.out.println("Hello world again");
    }
}

class Call implements M_Inheritence1, M_Inheritence2 {
    void print3() {
        System.out.println("Hello world back to back");
    }
}

class F {
    public static void main(String[] args) {
        Call obj = new Call();
        obj.print1();
        obj.print2();
        obj.print3();
    }
}