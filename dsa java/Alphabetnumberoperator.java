import java.util.*;
public class Alphabetnumberoperator
{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
       System.out.print("enter a alphabhet");
       char c=sc.next().charAt(0);
       if((c>='A'&&c<='Z')||(c>='a'&&c<='z')){
             System.out.print("it is alphabet");    
       }else if(c>='0'&&c<='9'){
             System.out.print("it is number");    
   
                
       }else{
           System.out.print("it is symbol");    
       }
      
   }
}