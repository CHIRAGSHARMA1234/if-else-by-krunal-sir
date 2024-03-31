import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t=a;
        int count=0;
        
        while(t>0){
            count++;
            t=t/10;
        }
        int sum=0;
        t=a;
        while(t>0){
        int r=a%10;
        sum+=Math.pow(t,count);
        t=t/10;
        
        }if(a==sum){
            System.out.print("it is amistrone");
        }else{
            System.out.print("it is not amistrone");
            
        }   
    }   
}
