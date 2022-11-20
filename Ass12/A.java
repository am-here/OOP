package Ass12;

import java.util.Scanner;
import Ass12_Package.A_package;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A_package obj = new A_package();
        System.out.print("Input 2 integers: ");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        obj.add(a1, b1);
        System.out.print("Input 2 double values: ");
        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        obj.add(a2, b2);
        System.out.print("Input 2 strings: ");
        String a3 = sc.nextLine();
        String b3 = sc.nextLine();
        obj.add(a3, b3);
        sc.close();
    }
}
