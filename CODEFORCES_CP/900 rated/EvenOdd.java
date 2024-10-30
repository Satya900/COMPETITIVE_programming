import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long num = scan.nextLong();   // Range up to which even/odd numbers are generated
        long n = scan.nextLong();     // Index to retrieve (1-based index)

        long oddCount = (num + 1) / 2;

        long result;
        if (n <= oddCount) {
            result = 2 * n - 1;
        } else {
            long evenIndex = n - oddCount;
            result = 2 * evenIndex;
        }

        System.out.println(result);
        scan.close();
    }
}
