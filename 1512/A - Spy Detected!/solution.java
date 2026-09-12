import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Compare first elements to find the common value
            if (a[0] != a[1] && a[0] != a[2]) {
                System.out.println(1);
            } else {
                for (int i = 0; i < n; i++) {
                    if (a[i] != a[0]) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
        scanner.close();
    }
}