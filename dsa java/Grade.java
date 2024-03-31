import java.util.*;
public class Grade{
   public static void main(String[] args){
      Scanner sc=new Scanner (System.in);
      System.out.print("enter a marks:");
      int a=sc.nextInt();
      if(a>90){
          System.out.print("grade a"); 
      }else if(a>80){
          System.out.print("grade b");
      }else if(a>70){
          System.out.print("grade c");
      }else if(a>60){
          System.out.print("grade d");
      }else if(a>50){
          System.out.print("grade e");
      }else{
          System.out.print("fail");
      }
   }
}