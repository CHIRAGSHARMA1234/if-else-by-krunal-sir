
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	     System.out.print(" enter a number ");
	    int a=sc.nextInt();
	    int flag=0;
	    for(int i=1;i*i<=a;i++){
	    if(i*i==a){
	               flag=1;}
	    }           
	     if(flag==1){
	         System.out.print(" it is perfect");
	     }else{
	         System.out.print(" it is not perfect square ");
	     }
	         
	     
	   
	
	}
}