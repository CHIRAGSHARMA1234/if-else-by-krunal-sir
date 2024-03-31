import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter First Number: ");
	    int n = sc.nextInt();
	    System.out.print("Enter Second Number: ");
	    int m = sc.nextInt();
	    int sum=0;
	    for(int i=n;i<=m;i++){
	        int x=i;
	        int y=i;
	         int ans = 0;
	         
	         for( ; y>0 ; y /= 10){
	              int a= y%10;
	               ans= ans*10+a;
	         }
	         if(x == ans) {
	                System.out.println(x);
	               
	                   sum=sum+x;
	               
	             
	         } 
	         
	    }
	    System.out.println(sum);
	      
	    
	}
}