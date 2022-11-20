import java.util.*;

class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        boolean leap = (year % 4 == 0) ? ((year % 100 == 0 && year % 400 != 0) ? false : true) : false;
        if (leap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
        sc.close();
    }
}