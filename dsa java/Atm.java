import java.util.*;
public class Atm{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a  money");
      int a=sc.nextInt();
      if(a%100==0){
          if(a%2000==0){
              int n=a/2000;
               a=a%2000;
               System.out.println("number of note in 2000:"+n);
          }
          if(a%500==0){
               int n=a/500;
               a=a%500;
               System.out.println("number of note in 500:"+n);
          }
          if(a%200==0){
               int n=a/200;
                a=a%200;
                System.out.println("number of note in 200:"+n);
          }
          if(a%100==0){
               int n=a/100;
               a=a%100;
               System.out.println("number of note in 100:"+n);
          }
      }else{
         System.out.print("enter the amount of multiple of 100");
      }
   }
}