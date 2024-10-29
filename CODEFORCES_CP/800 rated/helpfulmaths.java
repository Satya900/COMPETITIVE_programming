import java.util.Scanner;
import java.util.Arrays;

public class helpfulmaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        String[] numbers = str.split("\\+");
        
        Arrays.sort(numbers);
        
        String result = String.join("+", numbers);
        
        System.out.println(result);
        scan.close();
    }
}
