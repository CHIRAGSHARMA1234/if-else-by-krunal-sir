import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int y=1;
	    int n=0;
	    while(a>0){
	        int r=a%10;
	      if(r==9){
	           r=0;
	       
	        }
	        else{
	          r++;}
	        n=(r*y)+n;
	        a=a/10;
	        y=y*10;
	    } 
	        System.out.println("add the element"+n);
   }
	
	
}
