import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            // If n is less than or equal to 2, there are 0 ways.
            // Otherwise, the number of ways is (n - 1) / 2.
            if (n <= 2) {
                System.out.println(0);
            } else {
                System.out.println((n - 1) / 2);
            }
        }
        scanner.close();
    }
}