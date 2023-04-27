package Debug;

import java.util.Scanner;

public class Debugg {
    public Debugg() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tiến hành nhập phương trình bậc nhất AX + B = 0 ;");
        System.out.println("Nhập A : ");
        double a = scanner.nextDouble();
        System.out.println("Nhập B : ");
        double b = scanner.nextDouble();
        if (a != 0.0) {
            double c = -b / a;
            System.out.println(c);
        } else if (b != 0.0) {
            System.out.println(" Vô số...");
        } else {
            System.out.println("Phương trình vô nghiệm ");
        }

    }
}