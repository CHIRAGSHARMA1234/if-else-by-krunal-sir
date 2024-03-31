import java.util.*;
public class VK{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a amount");
      int a=sc.nextInt();
      int n;
      int Note2k=a/2000;
      n=a%2000;
      int Note5=a/500;
      n=a%500;
      int Note2=a/200;
      n=a%200;
      int Note1=a/100;
      n=a%100;
      if(a%100==0){
          if(a>=2000){
                System.out.println("2000 note"+Note2k);
              
          }
          if(a>=500){
                System.out.println("500 note"+Note5);
              
          }
          if(a>=200){
                System.out.println("200 note"+Note2);
              
          }
           if(a>=100){
                System.out.println("100 note"+Note1);
              
          }
          
      }else{
          System.out.println("invalid amount");
             
         
      }





   }
}