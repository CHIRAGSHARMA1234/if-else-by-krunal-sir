import java.util.*;
public class Main
{
	public static void main(String[] args) {
	     System.out.print("Enter any mumber");
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	   int flag=0;
	    
	    for(int i=2;i<=a;i++){
	        if(a%i==0){
	            flag=1;
	            
	        }
	            
	    }
	    if(flag==1||a==1){
	        System.out.print("it is not prime nuimber");
	    }else{
	         System.out.print("it is  prime nuimber");}
	    
	   
		
    }		
 }
