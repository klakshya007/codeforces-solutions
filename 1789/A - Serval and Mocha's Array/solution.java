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
    public static int gcd(int a, int b) {
    return (b == 0) ? Math.abs(a) : gcd(b, a % b);
}
 
    // ---------- MAIN ----------
    public static void main(String[] args) throws Exception {
 
        FastScanner fs = new FastScanner();
        int t=fs.nextInt();
        while(t-->0){
            String ans="No";
            int n=fs.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=fs.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j==i)continue;
                    if(gcd(arr[i], arr[j])<=2){
                        ans="Yes";
                        break;
                    }
                    else continue;
                }
                if(ans.equals("Yes"))break;
            }
            System.out.println(ans);
        }
    }
}