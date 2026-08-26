import java.util.*;
 
public class A116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxCap=0, currCap=0;
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            currCap+=(b-a);
            n--;
            maxCap=Math.max(maxCap, currCap);
        }
        System.out.print(maxCap);
        sc.close();
    }
}