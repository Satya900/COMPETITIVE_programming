import java.util.Scanner;

class Watermelon {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int weight = scan.nextInt();

        if (weight > 2 & weight % 2 == 0) {
            System.out.println("YES");
        }
        else{
            System.out.println( "NO");
        }
        
        scan.close();
    }
}



