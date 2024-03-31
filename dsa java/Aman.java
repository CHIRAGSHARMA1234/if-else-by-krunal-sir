import java.util.*;
public class Aman
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int y=1;
	    int n=0;
	    while(a>0){
	        int r=a%10;
	        n=((r+1)%10)*y+n;
	        n=n/10;
	        y=y*10;
	    }
	        System.out.println("add the element"+(n));
	    }
	
	
}
