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
        int t = fs.nextInt();
        while(t-->0){
            int a=fs.nextInt();
            int b=fs.nextInt();
            int c=fs.nextInt();
            int d=fs.nextInt();
            int up=d-b;
            if(up>=0){
                int hd=up+(a-c);
                if(hd>=0){
                    System.out.println(hd+up);
                }
                else System.out.println(-1);
            }
            else System.out.println(-1);
        }
    }
}