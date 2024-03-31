import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int ans=0;
        int t=a;
        while(a>0){
            int r=a%10;
            ans=ans*10+r;
             a=a/10;
        }if(t==ans){
           System.out.print("it is pendraline"+ans);
        }else{
            System.out.print("it is not pendraline"+ans);
        }
    }   
}
