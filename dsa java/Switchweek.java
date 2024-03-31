import java.util.*;
public class Switchweek{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("enter a day");
       int a=sc.nextInt();
       switch (a)
       {

           case 1:System.out.println("monday");
                  break;
           case 2:System.out.println("tuesday");
                  break;
           case 3:System.out.println("wedday");
                  break;
           case 4:System.out.println("thursday");
                  break;
           case 5:System.out.println("friday");
                  break;
           case 6:System.out.println("saturday");
                  break;
           case 7:System.out.println("sundaty");
                  break;
           default:System.out.println("invakid");
       }
   }
}