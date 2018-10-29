/**
 * This program estimates the value of pi by generating
 * random points to simulate throwing darts and checking
 * if they're on the circle, and then using that data
 * to calculate pi.
 * 
 * @author Will English
 * @version 11.4.17
 * 
 */
package challenge;

import java.util.*;
public class EstimatePi

{
	static Scanner in = new Scanner(System.in);
	public static double x = 0;
	public static double y = 0;
	public static int hits= 0;

	public static int hits (double x, double y, int trials){
		hits = 0;
		for(int n = 1; n < trials; n++) {
			x = Math.pow((2 * Math.random()) - 1, 2);
			y = Math.pow((2 * Math.random()) - 1, 2);
			if(x + y <= 1){
				hits++;
			}
        }
        return hits;
    }
	public static double calcPi(double hits, double darts){
		return 4 * hits / darts;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int trials = 0;
		int darts = 0;
		double average = 0;
		double approxPi = 0;
		int hits = 0;
		//take input
		System.out.println("How many trials would you like to conduct?");
		trials = in.nextInt();
		System.out.println("How many dart would you like to throw per trial?");
		darts = in.nextInt();	
		
		double totalThrows = (double)darts*trials;
		for(int n = 0; n < trials; n++){
			hits = hits(x,y,darts);
			approxPi = calcPi(hits, darts);
			totalThrows += approxPi;
			System.out.printf("Trial " + (n+1) + ": pi = %1.5f\n", approxPi);
		}
		average = (totalThrows / trials) - darts;
		
		 System.out.printf("Estimate of Pi: %1.5f", average);
	}
}
