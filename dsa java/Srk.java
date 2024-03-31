import java.util.*;
public class Srk{
   public static voiod main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a amount");
      int a=sc.nextInt();
      int n=amount;
      Note2k=amount/2000;
      amount=amount%2000;
      Note5=amount/500;
      amount=amount%500;
      Note2=amount/200;
      amount=amount%200;
      Note1=amount/100;
      amount=amount%100;
      if(a%100==0){
          if(a>=2000){
                System.out.println("2000 note"+Note2k);
              
          }
          if(a>=500){
                System.out.println("500 note"+Note5);
              
          }
          if(a>=200){
                System.out.println("200 note"+Note2);
              
          }
           if(a>=100){
                System.out.println("100 note"+Note1);
              
          }
          
      }else{
          System.out.println("invalid amount");
             
         
     }


   }
}