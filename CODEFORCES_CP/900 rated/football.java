import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int consecutiveCount = 1;  
        boolean dangerous = false;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                consecutiveCount++;
                if (consecutiveCount >= 7) {
                    dangerous = true;
                    break;
                }
            } else {
                consecutiveCount = 1;
            }
        }

        if (dangerous) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}
