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
            int n=fs.nextInt();
            int count_two=0;
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                int a=fs.nextInt();
                if(a==2)count_two++;
                arr[i]=a;
            }
            if(count_two==0)System.out.println(1);
            else if (count_two%2!=0)System.out.println(-1);
            else {
                count_two/=2;int curr_count=0;
                for(int i=0;i<n;i++){
                    if(arr[i]==2)curr_count++;
                    if(curr_count==count_two){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
            
        }   
    }
}