import java.io.*;
import java.util.*;
 
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
 
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
        int t=fs.nextInt();
        while(t-->0){
           int n=fs.nextInt();
           int m=n;n--;
           int ans=fs.nextInt();
           while(n-->0){
                ans^=fs.nextInt();
           } 
           if(m%2!=0){
            System.out.println(ans);
           }
           else {
            if(ans==0)System.out.println(0);
            else System.out.println(-1);
           }
        }
    }
}