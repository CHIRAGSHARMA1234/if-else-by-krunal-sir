import java.util.*;
public class rohit
{
  public static void main (String[]args){
	Scanner sc=new Scanner (System.in);
	int a = sc.nextInt();
	int sumeven = 0;
	int sumodd = 0;
	for (int i= 1; i<= a; i++){
		int x = sc.nextInt();
		if (x%2 == 0) {
			sumeven = sumeven + x;
		  }
		else{
		      sumodd=sumodd+x;

		  }
	  }
	System.out.println("sum of odd"+sumeven);
	System.out.println("sum of even"+sumodd);
	
  }
}
