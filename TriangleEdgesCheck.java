import java.util.Scanner;
public class TriangleEdgesCheck {
    public void checkTriangleEdges(int a, int b, int c)
            throws TriangleEdgesException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Loi: Tam giac khong hop le!");
        } else {
            System.out.println("Tam giac hop le!");
        }
    }
}
   class TriangleEdgesException extends Exception {

    public TriangleEdgesException(String str) {
        super(str);
    }
}
 class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TriangleEdgesCheck check = new TriangleEdgesCheck();

        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = sc.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            int b = sc.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = sc.nextInt();

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (TriangleEdgesException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Sai: khong dung dinh dang!");
        }

        sc.close();
    }
 }