import java.io.*;
import java.util.Scanner;

class Main
{
  static  void findTrailingZeros(int n)
	{
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5)
			count += n / i;
		 System.out.println("countis"+count);

		
	}
	

	public static void main (String[] args) 
	{
		int n;
		int t,i;
		Scanner sc = new Scanner(System.in);
		t=sc.nextInt();
		
		for(i=0;i<t;i++)
		{
			n=sc.nextInt();
		   findTrailingZeros(n);
		 
	    }
		
	}


}
