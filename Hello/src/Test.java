import java.lang.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int flag= 0;
		
     Scanner sc= new Scanner(System.in);
     int arr[] = new int[100];
     for(int i=0;i<100;i++) 
     {
    	arr[i]=sc.nextInt();
        if(arr[i]==42)
        {
        	flag=1;
        	
        }
        if(flag==0)
        {
        	System.out.println(arr[i]);
        }
     }
     
	}

}
