import java.util.Scanner;
public class dubstep {
    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String result = s.replace("WUB", " ");
        System.out.println(result);
    }
}
