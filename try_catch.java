import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = Integer.parseInt(scanner.nextLine());

            if (99 % n == 0)
                System.out.println(n + "hệ số của 99");

        }catch (ArithmeticException  | NumberFormatException ex){
            System.out.println("Gặp phải ngoại lệ" + ex );
        }
    }
}