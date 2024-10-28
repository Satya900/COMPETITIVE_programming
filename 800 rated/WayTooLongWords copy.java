import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            String word = scan.next();
            if (word.length() > 10) {
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                System.out.println(first + "" + (word.length() - 2) + last); // Added "" to concatenate chars and int as a string
            } else {
                System.out.println(word);
            }
        }
        
        scan.close(); // Close the scanner
    }
}
