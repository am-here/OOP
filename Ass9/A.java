import java.util.*;

class Employee {

    int EID;
    String name;
    double basic;
    String city;
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    void getDetails() {
        System.out.println("Enter deatils of the Employee:");
        System.out.print("Enter EID: ");
        EID = sc1.nextInt();
        System.out.print("Enter Name: ");
        name = sc2.nextLine();
        System.out.print("Enter Basic Pay: ");
        basic = sc1.nextDouble();
        System.out.print("Enter City: ");
        city = sc2.nextLine();
    }

    void showDetails() {
        System.out.println(
                "Employee Details:\nName: " + name + "\nCity: " + city + "\nBasic Pay: " + basic + "\nCity: " + city);
    }

    double Salary() {
        return basic;
    }
}

class Company1 extends Employee {
    double Salary() {
        double AGP = 0.4 * basic;
        double DA = 0.25 * (basic + AGP);
        double HRA = 0.1 * (basic + AGP);
        return basic + AGP + DA + HRA;
    }
}

class Company2 extends Employee {
    double Salary() {
        double AGP = 0.5 * basic;
        double DA = 0.5 * (basic + AGP);
        double HRA = 0.15 * (basic + AGP);
        return basic + AGP + DA + HRA;
    }
}

class A {
    public static void main(String[] args) {
        Employee P;
        Scanner sc = new Scanner(System.in);
        System.out.println("Company1: ");
        P = new Company1();
        P.getDetails();
        P.showDetails();
        System.out.println("Salary of " + P.name + " = " + P.Salary());
        System.out.println("Company2: ");
        P = new Company2();
        P.getDetails();
        P.showDetails();
        System.out.println("Salary of " + P.name + " = " + P.Salary());
        sc.close();
    }
}
