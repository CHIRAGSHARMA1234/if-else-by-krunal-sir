import java .util.*;
public class Weather{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print(" enter the temperature");
      int t=sc.nextInt();
      if(t<0){
          System.out.print(" freezing");
      }else if(t<10){
          System.out.print(" very cold");
      }else if(t<20){
          System.out.print(" cold");
      }else if(t<30){
          System.out.print("normal");
      }else if(t<=40){
          System.out.print(" hot");
      }else{
         System.out.print("very hot");
      }
   }
   
}