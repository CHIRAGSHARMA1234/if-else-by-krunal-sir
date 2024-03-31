import java.util.*;
public class Time{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter a hour");
       int h=sc.nextInt();
       System.out.println("enter a minute");
       int m=sc.nextInt();
       if(h<12){
                System.out.println(h+":"+m+"am");
          }
        
        
         if(h>12){
                  System.out.println((h-12)+":"+m+"pm");
          }
          else{ 

               System.out.println(h+":"+m+ "pm");
             }  
      }
}