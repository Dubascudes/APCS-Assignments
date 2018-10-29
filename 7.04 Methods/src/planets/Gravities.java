package planets;
import java.lang.Math;

public class Gravities {


	static double G=6.67* Math.pow(10,-11);
	public double find(double mass, double diameter){
		return (G*mass)/Math.pow(diameter/2*1000, 2);
	}
}
