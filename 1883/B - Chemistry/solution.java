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
            int k=fs.nextInt();
            k=k+1;
            String a=fs.next();
            if(n<=1){
                System.out.println("YES");
                continue;
            }
            Map<Character,Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++){
                mp.put(a.charAt(i),mp.getOrDefault(a.charAt(i), 0)+1);
            }
            Iterator<Map.Entry<Character,Integer>>iterator=mp.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Character,Integer>entry =iterator.next();
                if((entry.getValue())%2!=0){
                    k--;
                }
            }
            if(k>=0)System.out.println("YES");
            else System.out.println("NO");
        }
    }
}