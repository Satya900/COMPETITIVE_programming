

import java.util.Scanner;
public class dominopiling {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        if((M * N) % 2 == 0){
            System.out.println((M * N) / 2);
        }
        else
        { 
            System.out.println(((M * N)-1)/2);
        }
        
    }
    
}
