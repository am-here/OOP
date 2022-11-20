import java.util.*;

abstract class Number {

    int num;

    Number(int n) {
        num = n;
    }

    abstract void displayNum();
}

class HexNum extends Number {

    HexNum(int n) {
        super(n);
    }

    void displayNum() {
        int dup = num;
        String hex = "";
        while (dup != 0) {
            int rem = dup % 16;
            if (rem <= 9) {
                hex = (char) (rem + 48) + hex;
            } else {
                hex = (char) (rem + 55) + hex;
            }
            dup /= 16;
        }
        System.out.println(
                "Hexadecimal Number: " + hex);
    }
}

class OctNum extends Number {

    OctNum(int n) {
        super(n);
    }

    void displayNum() {
        int dup = num;
        String oct = "";
        while (dup != 0) {
            int rem = dup % 8;
            oct = (char) (rem + 48) + oct;
            dup /= 8;
        }
        System.out.println(
                "Octal Number: " + oct);
    }
}

class B {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = sc.nextInt();
        Number n1 = new HexNum(num);
        n1.displayNum();
        Number n2 = new OctNum(num);
        n2.displayNum();
        sc.close();
    }
}
