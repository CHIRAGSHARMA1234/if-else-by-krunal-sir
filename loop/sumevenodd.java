import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int sumeven=0;
	    int sumodd=0;
	    while(a>0){
	        int r=a%10;
	        if(a%2==0){
	        ++sumeven;}
	        else{
	            ++sumodd;}
	            a=a/10;
	        
	        
	    }
		System.out.println("sum of even"+sumeven);
		System.out.println("sum of odd"+sumodd);
	}
}
