import java.util.*;
public class Coding
{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number 1"); 
      int a=sc.nextInt();  
      if(a%2==0){
           if(a%3==0){
                 System.out.println("coding thinker");
           
           }
           else{
                 System.out.println("coding");
           }

      }
      if(a%3==0){
                 System.out.println("thinker");
      }    
   
    }
 }
