import java.util.*;
public class Libraryfine{
   public class main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("how many days");
      int d=sc.nextInt();
      if(d>=3){
         if(d>=10){
             if(d>=30){
                 System.out.println("Membership canceelled");
               
             }else{
               System.out.println("fine of 50 ruppes"); 
             }
         else{
          System.out.println("fine of 20 ruppes");
         }
         }  
      } else{
          System.out.println("fine of 10 ruppes");
         }
      
   }
}