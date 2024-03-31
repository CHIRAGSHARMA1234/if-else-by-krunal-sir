import java.util.*;
public class Week{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.print(" enter a number:");
      int a=sc.nextInt();
      if(a>0 && a==7){
            if(a==1){
                System.out.println("sunday");
         }
            if(a==2){
                System.out.println("monday");
            }
            if(a==3){
                 System.out.println("tuesday");
            }
            if(a==4){
                 System.out.println("wed");
            }
            if(a==5){
                 System.out.println("thursday");
            }
            if(a==6){
                 System.out.println("friay");
            }
            if(a==7){
                 System.out.println("sunday");
            }
              
                        
      }else{
         System.out.println("invalid"); 
      }
   }
}