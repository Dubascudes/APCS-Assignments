package planets;
import planets.Gravities;
import java.util.Scanner;
public class PlanetWeightV2 {
	static Gravities grav = new Gravities();
	public static double weight(double mass, double surfGrav){
		return mass *surfGrav*.226213;
	}
	public static void header(){
	     System.out.println();
	     System.out.println();
		 System.out.println("                      			Planetary Data");
	     System.out.println();
	     System.out.println("Planet   	 Diameter (km)   	 Mass (kg)  	   g (m/s^2)    	 My Weight(lbs)");
	     System.out.println("===================================================================================================");
	}
	public static void output(String [] names, double [] diameter, double[] mass, double [] gravity, double kg){
		for(int x = 0; x <names.length; x++){
	    	 double gravx = grav.find(mass[x],diameter[x]);
			//System.out.println(names[x]+"	"+ 	diameter[x]+"	 "+mass[x]+"	"+gravity(mass[x],diameter[x]/2));
	        System.out.printf("%-12s%15.2f%20.2e%20.2f%22.2f\n" ,  names[x] , diameter[x] , mass[x], gravx, weight(kg, gravx));
	        gravity[x] = gravx;

		}
	}
	public static void main(String [] args){
		 String [] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		 double [] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
		 double [] mass = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
		 
		 double [] gravity = new double [names.length];
		 Scanner in = new Scanner(System.in);
		 int wht = 0;
		 System.out.println("How much do you weigh?");
		 wht = in.nextInt();
		 double kg = (wht * 433.59237)/9.8/9.8/10;
		 grav.find(kg,9.8);
		 header();
		 output(names,diameter,mass,gravity,kg);
		 in.close();
	     
	}
}
