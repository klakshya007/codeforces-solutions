import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;
 
        // Since a^2 + b = n and a + b^2 = m, a and b must be <= 1000
        for (int a = 0; a <= 1000; a++) {
            for (int b = 0; b <= 1000; b++) {
                if ((a * a + b == n) && (a + b * b == m)) {
                    count++;
                }
            }
        }
 
        System.out.println(count);
    }
}