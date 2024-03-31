import java.util.*;
public class vowelandconstanant{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("enter a varialble");
      char c=sc.next().charAt(0);
      if(c=='a'||c=='e'||c=='i'||c=='0'||c=='u'){
           System.out.print("it is vowel");
           
      }else{
         System.out.print("it is consonent");
       }
   }
}
