import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int count = 0; 

        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a + b + c >= 2) {
                count += 1;
            }
        }
        
        System.out.println(count);
        scan.close();
    }
}
