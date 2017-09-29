/** Purpose: Simulate animal sightings
 * 
 * @version 8/27/17
 * 
 * @author Will English
 * 
 */
import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class AnimalPopulation {
	
	public static void main (String args []) throws InterruptedException, IOException {
		//local variables
		int a = 0;
		int count = 0;
		int counter = 0;
		int sim = 0;
		Random rand = new Random();
		int lizWoBlu = 0;
		int lizWoBlu2 = 0;

		PrintWriter outFile = new PrintWriter(new File("results.txt"));
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number of simulations (greater than 999): ");
		sim = in.nextInt();
		while(sim < 1000){
			System.out.print("Invalid entry.\nPlease enter number greater than 999: ");
			sim = in.nextInt();
		}
		while(counter != sim) {	
			double rndm = rand.nextInt(4);
			if (rndm == 1) {
				lizWoBlu++;
				outFile.println(counter);
				a++;
				counter++;
				lizWoBlu2+=lizWoBlu;
				lizWoBlu = 0;
			}else{
			lizWoBlu++;
			counter++;
		
			}
		}
		System.out.print("Running simulation");
		while(count<4){
		Thread.sleep(500);
		System.out.print(".");
		count++;
		}
		System.out.println("\n");
		double avg = (double)lizWoBlu2/(double)a;
		System.out.println("Results:");
		System.out.println("Average number of lizards observed until spotting one with a blue tongue: "+avg);
		in.close();
	}
}
