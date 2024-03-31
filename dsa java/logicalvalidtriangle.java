import java.util.*;
public class Logicalvalidtriangle{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a number");
      int a=sc.nextInt(); 
      System.out.print("enter a number");
      int b=sc.nextInt();
      System.out.print("enter a number");
      int c=sc.nextInt(); 
      if((a+b>c)&&(b+c>a)&&(a+c>b)){
         System.out.println("valid triangle");
      }else{
          System.out.println("invalid triangle");
      }
   }
}