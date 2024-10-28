import java.util.Scanner;

public class petyastrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String a = scan.next().toLowerCase(); 
        String b = scan.next().toLowerCase(); 
        
        int comparison = a.compareTo(b); 
        
        if (comparison < 0) {
            System.out.println("-1");
        } else if (comparison > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        scan.close();
    }
}
