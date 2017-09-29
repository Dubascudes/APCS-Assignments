
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Title: 05.03 Reading Text Files
 * 
 * Purpose: Read string input from text files 
 * 
 * @version 8/22/17
 * 
 * @author Will English
 * 
 * 
 */

public class Family {
	
	public static void main(String[] args) throws IOException {
		
		int countGG = 0;
		int countBG = 0;
		int countBB = 0;
		int countGB = 0;
		int count = 0;
		
		File fileName = new File("MaleFemaleInFamily.txt");
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNext()){
			String token = inFile.next();
			if (token.equals("BB")) {
				countBB++;
				count++;
			}
			else if (token.equals("GG")) {
				countGG++;
				count++;
			}
			else if (token.equals("BG")) {
				countBG++;
				count++;
			}
			else if (token.equals("GB")) {
				countGB++;
				count++;
			}
		}
		
		int size = count;

        int totalGB = countGB + countBG;
        
		inFile.close();
		double bbPercent = countBB / (double)size * 100;
		double ggPercent = countGG / (double)size * 100;
        double totalGBPercent = totalGB / (double)size * 100;
        
        System.out.println("Gender statistice for families with two children");
        
		System.out.println("Total number of families " + size);
		System.out.print("Two boys: " + countBB);
		System.out.println("					Represents: " + bbPercent + "%");
		System.out.print("Two girls: " + countGG);
		System.out.println("				Represents: " + ggPercent + "%");
		System.out.print("One of each: " + totalGB);
		System.out.println("				Represents: " + totalGBPercent + "%");	
	}
}