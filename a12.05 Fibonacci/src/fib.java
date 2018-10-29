/**
 * @version 2/15/18
 * @author Will English
 * Purpose: Calculate fibonacci numbers
 * 
 * 
 */

import java.util.Scanner;
public class fib 
	{
	public static int fibNum(int n)
		{
		int result = 0;

		
	    if(n == 0) return 0;
		else if(n == 1)return 1;
		else if(n > 1 && n < 40)
		{
			result = fibNum(n-1) + fibNum(n-2);
			return result;
		}		
		
	    if(n > 40)
		{
			System.out.println("Thats too big!"); 
			
		}
		return result; 

	}
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = 0;
		boolean loop = true;
		try
		{

			while(true&&loop)
			{
				n=0;
				System.out.println("Please input an integer");
				System.out.print("Value: ");
				try
				{
				n = in.nextInt();
				System.out.print("Fibonacci number: ");
				System.out.println(fibNum(n));
				}
				catch(Exception e)
				{
					System.out.println("That's invalid input!");
					in.next();
				}
			}
		}
			finally
			{
				in.close();
			}
		}
	}
	
