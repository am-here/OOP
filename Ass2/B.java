import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic, AGP, merged, DA, HRA, total;
        System.out.print("Enter basic pay: ");
        basic = sc.nextDouble();
        AGP = 0.5 * basic;
        merged = basic + AGP;
        DA = 0.5 * merged;
        HRA = 0.15 * merged;
        total = basic + AGP + DA + HRA;
        System.out.println("Total Salary: " + total);
        sc.close();
    }
}