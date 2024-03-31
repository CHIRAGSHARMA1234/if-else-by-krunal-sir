import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int a=sc.nextInt();
	    int count=0;
	    int f=0;
	    int temp=a;
	     
	    int l=a%10;
	    while(a>0){
	        f=a%10;
	        count++;
	        a=a/10;
	    }
	      a=temp;
	     a=a/10;
	     a=a*10+f;
	      a=a%(int) Math.pow(10,count-1);
	      a=l*(int) Math.pow(10,count-1)+a;
	  	  System.out.println("swap element"+a);
	}
}
