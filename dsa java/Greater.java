import java.util.*;
public class Greater{
   public static void main(String[] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("enter a number 1");
    int a=sc.nextInt();
    System.out.println("enter a number 2");
    int b=sc.nextInt();
    System.out.println("enter a number 3");
    int c=sc.nextInt();
    if((a>b)&&(a>c)){
         
     System.out.println("a is greater");
    }
    else{
           if((b>c)&&(b>a)){
    System.out.println("b is greater");
    }
    else{
    System.out.println("c is greater"); 
    }
    }
  
   }
}