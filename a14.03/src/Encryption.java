/**
 * @author Will English
 *
 * @version 3/22/18
 *
 * Uses a Caesar cipher to encrypt a message 
 *
 */
public class Encryption 
{

	private String[] cipherAlphabet = new String[CaesarTester.alphabet.length];
	
	public Encryption(int shift)
	{
		for(int i = 0;  i < CaesarTester.alphabet.length; i++)
		{
			cipherAlphabet[i] = CaesarTester.alphabet[(i+shift)%26];
		}
	}
		

	public void showCipherAlphabet()
	{
		for(String l : cipherAlphabet)
		{
			System.out.print(l+" " );
		}
	}
	
	public String encrypt(String message)
	{
		String result = "";
		 for (int i = 0; i < message.length(); i++)
		 {
			 if (message.charAt(i) == ' ') 
			 {
		     result += " ";
			 }
			 else
			 {
				 for (int j = 0; j < cipherAlphabet.length; j++) 
				 {
					 if (message.substring(i, i + 1).equals(CaesarTester.alphabet[j])) 
					 {
						 result += cipherAlphabet[j];
					 }
	             }
			 }
	     }
			return result; 
	}
}
