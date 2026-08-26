import java.util.Scanner;
 
public class A_Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            count += (a/h)+1;
            if(a%h==0)count--;
        }
        System.out.print(count);
        sc.close();
    }
}