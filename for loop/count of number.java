import java.util.*;
public class Main
{
  public static void main (String[]args){
	Scanner sc=new Scanner (System.in);
	System.out.println("count");
	int a = sc.nextInt();
	int counteven = 0;
	int countodd = 0;
	int countpositive=0;
	int countnegative=0;
	for (int i= 1; i<=a; i++){
		int x = sc.nextInt();
		if (x%2 == 0) {
			counteven++;
		  }
		else{
		      countodd++;

		  }if(x>=0){
		      countpositive++;
		      
		  }else{
		      countnegative++;
		          
		      
		  }
	  }
	System.out.println("countof even"+counteven);
	System.out.println("count of odd"+countodd);
	System.out.println("count of positive"+countpositive);
	System.out.println("count of negative"+countnegative);
	
	
  }
}
