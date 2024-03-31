import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int min=a%10;
	    int max=a%10;
	    while(a>0){
	        int r=a%10;
	        if(r<min){
	           min=r;
	        }if(r>max){
	            max=r;
	        }
	        a=a/10;
	    }
		System.out.println("min value"+min);
		System.out.println("max value"+max);
	}
}