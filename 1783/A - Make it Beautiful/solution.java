import java.io.*;
import java.lang.reflect.Array;
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
            int n=fs.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=fs.nextInt();
            }
            if(arr[0]==arr[n-1])System.out.println("NO");
            else{
                System.out.println("YES");
                int temp=arr[1];
                arr[1]=arr[0];
                arr[0]=arr[n-1];
                arr[n-1]=temp;
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            
        }
    }
}