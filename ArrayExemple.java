import java.util.Random;
import java.util.Scanner;

public class ArrayExemple {
    public Integer[] creatRandom(){
        Random random = new Random();
        Integer[] arr = new  Integer[100];
        System.out.println("Danh sách phần tử của mảng : ");
        for (int i = 0; i < 100; i++) {
            arr [i] = random.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}
class In {
    public static void main(String[] args) {
        ArrayExemple arrayExemple = new ArrayExemple();
        Integer[] arr = arrayExemple.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ : ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá tri của phần tử có số 5" + x + " là  " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}