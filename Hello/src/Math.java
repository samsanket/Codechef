import java.lang.*;
import java.util.*;
import java.util.Scanner;
public class Math {

	public static void main(String[] args) {
		 int first,second,third,temp=0;
		
		Scanner sc= new Scanner(System.in);
		
		first=sc.nextInt();
		second=sc.nextInt();
		third=first-second;
		System.out.println(third);
         int num =third;
          while (temp >0)
          {
              temp /= 10; 
          	System.out.println(temp);
                      
          }
         
	}
	

}
