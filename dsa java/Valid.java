import java .util.*;
public class Valid{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a number");
      int a=sc.nextInt();
      System.out.print("enter a number");
      int b=sc.nextInt();
      System.out.print("enter a number");
      int c=sc.nextInt();
      if(a+b>c){
         if(a+c>b){
            if(b+c>a){
                System.out.println("it is valid triangle");
            }else{
               System.out.println("it is invalid triangle");
            }
         }else{
            System.out.println("it is invalid triangle");
         }
      }else{
          System.out.print("it is invalid triangle");
     
      }
      
   }
}