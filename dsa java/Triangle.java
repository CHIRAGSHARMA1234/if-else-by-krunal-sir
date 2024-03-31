import java.util.*;
public class Triangle{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a number");
      int a=sc.nextInt();
      System.out.print("enter a number");
      int b=sc.nextInt();
      System.out.print("enter a number");
      int c=sc.nextInt();
      if(a==b){
         if(b==c){
            System.out.println("it is equilateral");
         }else{
            System.out.println("it is iso");
         }
      }else{
          if(b==c){
             System.out.println("it is isosalis");
          }else{
              if(a==c){
                 System.out.println("it is isosalis");
              }else{
                 System.out.println("it is scalen");
              }
              
           }  
       }
   }
}