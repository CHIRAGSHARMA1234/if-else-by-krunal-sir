import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int sum=0;
	   // int l=a%10;
	    int r;
	    while(a>0){
	        r=a%10;
	        sum=sum+r;
	        a=a/10;
	        
	   }
	    
		System.out.println("swap and add the digit"+sum);
	}
}
