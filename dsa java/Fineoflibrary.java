import java.util.*;
public class Fineoflibrary{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in); 
      System.out.print("enter a days");
      int d=sc.nextInt();
      if(d<=3){
         System.out.println("fine is 10 rupees");
      }else{
          if(d<=10){
              System.out.println("fine is 20 rupees");
          }else{
             if(d>30){
                 System.out.println("fine is 50 rupees and membership is cancell");
             }else{
                System.out.println("fine is 50 ");
              } 
        }
       }
   }
}