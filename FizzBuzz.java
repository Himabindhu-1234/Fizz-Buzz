package JavaPrograms;
import java.util.*;
public class FizzBuzz
{
	public static String fizzBuzz(int i) {
	 if (i%3==0 && i%5==0)                                                
        return "Fizz Buzz";
    
     else if (i%5==0)    
        return "Buzz";

     else if (i%3==0)    
         return "Fizz";
          
     else
         return ""+i; 
	}
	public static void main(String args[])
	    {
	       
	        Scanner s = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int i = s.nextInt();
			
			System.out.println(fizzBuzz(i));
	            
	                                  
	        }
	    }
	
