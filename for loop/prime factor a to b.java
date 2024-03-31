import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter any mumber a");
	    int a=sc.nextInt();
	    System.out.print("Enter any mumber b");
	    int b=sc.nextInt();
	    int sum=0;
	    
	    for(int i=a;i<=b;i++){
	    int flag=0;
	        for(int j=2;j<i;j++){
	        if(i%j==0){
	            flag=1;
	            break;
	            }
	            
	        }
	         if(flag==0&& i!=1){
	          sum=sum+i;
	        System.out.println(i);
	        
	            
	       }
	    }
	         
	   // if(flag==0){
	      //  System.out.print(b);
	        
	    //}
	}
 }