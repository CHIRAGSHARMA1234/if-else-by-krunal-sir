import java.util.*;
public class Year{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("number of days");
      int a=sc.nextInt();
      if(a>=365){
          int n=a/365;
              a=a%365;
           System.out.println("number of year"+n);
      }
      if(a>=30){
          int n=a/30;
              a=a%30;
           System.out.println("number of month"+n);
         
      }
      if(a>=7){
          int n=a/7;
              a=a%7;
            System.out.println("number of week"+n);
        
      }
      if(a>=1){
           int n= a/1;
           a=a%1;
            System.out.println("number of days"+n);
      }
   }
}