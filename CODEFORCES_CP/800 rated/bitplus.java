import java.util.Scanner;
public class bitplus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int X = 0;

        for (int i = 0; i < n; i++) {
            String str = scan.next();
            if (str.charAt(1) == '+') { 
                X++;
            } else {
                X--;
            }
        }
        
        System.out.println(X);
        scan.close();
    }
}
