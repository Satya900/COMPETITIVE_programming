
import java.util.Scanner;
public class nextround {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] scores = new int[n];
        for(int i = 0; i < n ; i++){
            scores[i]= scan.nextInt();
        }
        int count = 0;
        for(int i = 0; i<n;i++){
            if(scores[i]>=scores[k-1] & scores[i]>=1){
                count++;
                
            }
        }
        System.out.println(count);
        scan.close();
    }
}
