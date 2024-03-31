import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++){
           if (a%i==0){
               sum=sum+i;
               
                
            }
            
        }if(sum==a){
            System.out.print("no is perfect");
        }else{
            System.out.print("no us not perfect");
        }
    }
}
