import java.io.*;
import java.util.*;
 
public class Main {
 
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
    }
 
    public static void main(String[] args) throws Exception {
 
        FastScanner fs = new FastScanner();
 
        int t = fs.nextInt();
 
        while (t-- > 0) {
 
            int mx = fs.nextInt();
            int my = fs.nextInt();
 
            int kx = fs.nextInt();
            int ky = fs.nextInt();
 
            int qx = fs.nextInt();
            int qy = fs.nextInt();
 
            int[][] moves = {
                { mx,  my},
                { mx, -my},
                {-mx,  my},
                {-mx, -my},
 
                { my,  mx},
                { my, -mx},
                {-my,  mx},
                {-my, -mx}
            };
 
            Set<String> king = new HashSet<>();
            Set<String> queen = new HashSet<>();
 
            // Positions from King
            for (int[] move : moves) {
                int x = kx + move[0];
                int y = ky + move[1];
 
                king.add(x + "," + y);
            }
 
            // Positions from Queen
            for (int[] move : moves) {
                int x = qx + move[0];
                int y = qy + move[1];
 
                queen.add(x + "," + y);
            }
 
            int answer = 0;
 
            // Count common positions
            for (String pos : king) {
                if (queen.contains(pos)) {
                    answer++;
                }
            }
 
            System.out.println(answer);
        }
    }
}