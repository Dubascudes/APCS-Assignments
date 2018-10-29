/**
 * This is the tester class for the Encryption and Decryption classes
 * 
 * 
 * @author Will English	
 * 
 * @version 3/26/18
 * 
 * 
 */
import java.util.Scanner;
public class CaesarTester {
    public static final String[] alphabet = 
    	{ 
    			"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
    			"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" 
        };
    public static void main (String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	String message = "";
    	boolean run = true;
    	System.out.println("Welcome to the Caesar Cipher");
    	String minput = "";

    	
    	while(run == true)
    	{
    		System.out.println();
        	System.out.println("Menu:");

        	System.out.println("a. Encrypt a message");
        	System.out.println("b. Decrypt a message");
        	System.out.println("c. Exit");
        	minput = in.next();
        	
        	
        	if(minput.equalsIgnoreCase( "a"))
        	{
        		System.out.println("What shift would you like to apply to your Caesar Cipher?");
        		int input = in.nextInt();
        		Encryption caesar = new Encryption(input);
        		System.out.println();
        		System.out.println("Your key is:");
        		caesar.showCipherAlphabet();
        		System.out.println();
        		System.out.println("What message would you like to encrypt?");
        		message = in.nextLine();
        		message = in.nextLine();
        		System.out.println(caesar.encrypt(message)); 	
        	}
        	if(minput.equalsIgnoreCase( "b"))
        	{
        		
        		System.out.println("What is the shift to your key?");
        		int input = in.nextInt();
        		Decryption de = new Decryption(input);
        		System.out.println();
        		System.out.println("Your key alphabet is:");
        		de.makeKey();
        		System.out.println();
        		System.out.println("What message would you like to decrypt?");
        		message = in.nextLine();
        		message = in.nextLine();
        	

        		
        		System.out.println("Your decrypted message is:");
        		System.out.println(de.decrypt(message)); 	

        	}
        	
        	if(minput.equalsIgnoreCase("c"))
        	{
        		System.out.println("Thank you!");
        		run = false;
        	}
    	}
    }
}
