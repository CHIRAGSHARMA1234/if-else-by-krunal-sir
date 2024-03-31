import java.util.*;
public class Meter{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a reading");
      int r=sc.nextInt();
      if(r<=100){
           System.out.print((r*4)*1.1);
      }else{
         if(r<=200){
             System.out.print((((r-100)*6)+400)*1.1);
         }else{
            if(r<=300){
              System.out.print((((r-200)*7)+1000)*1.1);
            }else{
                if(r<=400){
                     System.out.print((((r-300)*8)+1700)*1.1);
                }
                else{
                   if(r>500){
                        System.out.print((((r-400)*10)+2500)*1.1);
                   }else{
                         System.out.print((((r-500)*12)+2700)*1.1);
                    }
                }
             }
          }
       }
   
   }
}