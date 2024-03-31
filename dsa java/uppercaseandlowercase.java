import java.util.*;
public class uppercaseandlowercase
{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
       System.out.print("enter a alphabhet");
       char c=sc.next().charAt(0);
       if(c>='A'&&c<='Z'){
             System.out.print("upper case");    
       }else{
            System.out.print("lower case");
       }
      
   }
}