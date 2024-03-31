import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    int ans=0;
	    while(n>0){
	        int r=n%10;
	        if(n%2==0){
	        sum=sum+r;}
	        else{
	        ans=ans+r;
	        }
	        n=n/10;
	         
	    }
		System.out.println("even is "+(sum));
	   System.out.println("odd is "+(ans));
	   
		
		
	}
}
