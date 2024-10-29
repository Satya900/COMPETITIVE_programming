import java.util.Scanner;

public class StampGridPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        StringBuilder resp = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); 
            
            int max_width = 0;
            int totalhet = 0;

            for (int j = 0; j < n; j++) {
                int w = scanner.nextInt();
                int h = scanner.nextInt();

                max_width = Math.max(max_width, w);
                totalhet += h;
            }

            int minPeri = (max_width + totalhet);
            resp.append(minPeri).append("\n");
        }
        
        System.out.print(resp.toString());
        scanner.close();
    }
}
