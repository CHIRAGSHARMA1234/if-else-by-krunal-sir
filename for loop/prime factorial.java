import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    for(int i=2;i<=a;i++){
	        if(a%i==0){
	            int flag=0;
	            for(int b=2;b<i;b++){
	                if(i%b==0){
	                    flag=1;
	                }
	            }
	            if(flag==0){
	                System.out.println(i);
	            }
	        }
	        
	    }
		
	}
}

