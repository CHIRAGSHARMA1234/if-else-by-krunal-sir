import java.util.*;
public class Temp{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.print(" enter a number:");
      int a=sc.nextInt();
      System.out.print(" enter a number:");
      int b=sc.nextInt();
      int t=a;
          a=b;
          b=t; 
      
      System.out.println("a"+a);
       System.out.println("b"+b);          
   }
}