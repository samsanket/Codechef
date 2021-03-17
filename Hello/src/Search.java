import java.util.Scanner;

public class Search {
 
   
	public static void main(String[] args) {
    /// System.out.println("Enter sentance");
     
     Scanner sc= new Scanner(System.in); 
     System.out.print("Enter a string: ");
     String str= sc.nextLine();
     
     System.out.print("Enter key: ");
     String str2= sc.nextLine();
    
     
     String a[] = str.split(" "); 
   
      
     int c = 0; 
     for (int i = 0; i < a.length; i++)  
     { 
     if (str2.equals(a[i])) 
         c++; 
     
     
     } 
    
     System.out.print("The word \t"+str2);
     System.out.print("\t is repeted "+c);
     System.out.print("\t Times in string \n");
     
   
     
	}
	    
}


/* (1)
 *  if(str.contentEquals(word))
         {
             c++;
             
         }
 * 
 * */

/*
 * 
 * 
 * 
 * */

// Accept string 
// Accpet key
// 