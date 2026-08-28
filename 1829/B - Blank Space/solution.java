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
        int t=fs.nextInt();
        while(t-->0){
            int curr_count=0;
            int max_count=0;
            int n=fs.nextInt();
            for(int i=0;i<n;i++){
                int a=fs.nextInt();
                if(a==0)curr_count++;
                else curr_count=0;
                max_count=Math.max(curr_count,max_count);
            }
            System.out.println(max_count);
        }
    }
}