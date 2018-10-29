/**
 * This is the Decryption class, it decrypts messages encoded with a caesar cipher
 * 
 * 
 * @author Will English	
 * 
 * @version 3/26/18
 * 
 * 
 */
public class Decryption {

	public static int shift = 0;
	
	public Decryption(int shiftConstr)
	{
		shift = shiftConstr % 26;
	}
	
	public static String[] key = new String[26];
	
	public static void makeKey()
	{
		for(int i = 0; i < 26; i++)
		{
            if (i - shift >= 0 && i - shift <= 25) 
            {
                key[i] = CaesarTester.alphabet[i - shift];
            }
            else
            {
                key[i] = CaesarTester.alphabet[(i - shift) + 26];
            }			
		}
      
        
        System.out.println();
       
        for (String l : key) 
        {
            System.out.print(l+" ");
        }
	}
	
	public static String decrypt(String msg)
	{
		String result = "";
		 for (int i = 0; i < msg.length(); i++) 
		 {
	            if (msg.charAt(i) == ' ') 
	            {
	                result += " ";
	            }
	            else 
	            {
	                for (int j = 0; j < key.length; j++)
	                {
	                    if (msg.substring(i, i + 1).equals(CaesarTester.alphabet[j]))
	                    {
	                        result += key[j];
	                    }
	                }
	            }
		 }
		 return result;
	}
}
