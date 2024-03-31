import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int p=1;
        int n=0;
        int carry=0;
        while(a>0&&b>0){
            int x=a%10;
            int y=b%10;
            int z=x+y+carry;
            n=(z%10)*p+n;
            carry=z/10;
            a=a/10;
            b=b/10;
            p=p*10;
            
        }
        n=(carry+a+b)*p+n;
        System.out.print("sum is"+n);
    } 
}