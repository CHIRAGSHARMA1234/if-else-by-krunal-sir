import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        while(a>0){
            // int n=a%10;
            sum=++sum;
            a=a/10;
            
        }
        System.out.println("sum is"+sum);
    }
}
