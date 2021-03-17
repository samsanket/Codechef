import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reverse {
	 public static void main(String args[])
	 {
       
		 System.out.print("Enter key: ");
	     Scanner sc= new Scanner(System.in); 

	     String str;

	        str = sc.nextLine();
	        StringBuilder strb  = new StringBuilder(str);
         
         strb.reverse();
   	        System.out.print(strb);
       /*
          char s[]=str.toCharArray();
          int i=0;
          for(i=str.length()-1;i>=0;i--)
        	  
          {
        	  System.out.print(s[i]);
        	  
          }
	 */
	 }
}
