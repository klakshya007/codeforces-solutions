import java.io.*;
import java.util.*;
 
public class Main {
 
    // ---------- FAST SCANNER ----------
    static class FastScanner {
        private final BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
 
        private StringTokenizer st;
 
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }
 
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
 
        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
 
    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {
 
        FastScanner fs = new FastScanner();
        int a=fs.nextInt();
        String b = "";
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                b += "I hate";
            } else {
                b += "I love";
            }
 
            if (i != a) {
                b += " that ";
            } else {
                b += " it";
            }
        }
        System.out.println(b);
    }
}