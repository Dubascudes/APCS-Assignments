/**
 * @author Will English
 * @version 9/28/17
 * Takes radius input, calculates y coordinate, and gives x coordinate and
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class CirclePoints {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		double radius = 1;
		double xcoord = 1;
		double ycoord = 1;
		System.out.print("Points on a circle with a radius of: ");
		radius = in.nextInt();
		System.out.println("x1\ty1\tx1\ty2");
		System.out.println("===============================");
		while(xcoord <=1 && xcoord>-1){
			ycoord =(double) Math.round(Math.sqrt(Math.pow(radius, 2) - Math.pow(xcoord, 2))* 100) / 100;
			System.out.println(df.format(xcoord)+"\t "+df.format(ycoord)+"\t"+df.format(xcoord)+"\t "+df.format(ycoord*-1));
			xcoord-=.1;			//decrement value
		}
		in.close();
	}
}
