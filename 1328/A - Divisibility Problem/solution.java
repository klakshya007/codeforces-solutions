import java.util.Scanner;
 
public class A1328{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a%b;
            if(c!=0)c=b-c;
            System.out.println(c);
            t--;
        }        
        sc.close();
    }
}