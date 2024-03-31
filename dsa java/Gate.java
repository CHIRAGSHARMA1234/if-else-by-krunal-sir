import java.util.*;
public class Gate{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.print(" enter a number:");
      int a=sc.nextInt();
      System.out.print(" enter a number:");
      int b=sc.nextInt();
       
       a=a^b;
       b=a^b;
       a=a^b;
      System.out.println("a"+a);
       System.out.println("b"+b);          
   }
}