import java.util.*;
public class Fine{
   public static void main(String[] args){
      Scannersc=new Scanner(System.in);
      System.out.println("days");
      int a=sc.nextInt();
      if(a<=3)
        System.out.println("fine is 10 rupees");
      }
      else if(a<=10){
           System.out.println("fine is 20 rupees");
      }
      else if(a<=30){
           System.out.println("fine is 50 rupees and membership is also cancell");
      }
      else{
           System.out.println("fine is 50 rupees");
      }
   }
}