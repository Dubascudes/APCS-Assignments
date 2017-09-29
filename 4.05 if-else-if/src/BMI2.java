/** Calculates the BMI of the user and categorizes it
 * 
 * @author Will English
 * @version 7/15/17
 * 
 */
import java.util.Scanner;
public class BMI2 {
	  public static void main(String[ ] args) 
	  {
		  Scanner in = new Scanner(System.in);
		  //Local Variables
		  String name;
		  int weight;
		  int heightFT;
		  int heightIN;
		 
		  System.out.println("Enter your name (first and last): ");
		  name = in.nextLine();
		  System.out.println("Enter your weight in pounds: ");
		  weight = in.nextInt();
		  System.out.println("Enter your height in feet and inches (for 5ft 11in, enter 5 11): ");
		  heightFT = in.nextInt();
		  heightIN = in.nextInt();
		  int inchConvert = heightFT * 12;
		  int height = heightIN + inchConvert ;
		  double KiloWeight = weight /2.2046;
		  double MetricHeight = height / 39.3701;
		  double BMI = KiloWeight / (MetricHeight * MetricHeight);

		  String Category;
		  if (BMI <= 18.5) {
				String underweight = "Underweight";
				Category = underweight;
			}
			else if (BMI <=24.9) {
				String normal = "Normal";
				Category = normal;
			}
			else if (BMI <=29.9) {
				String overweight = "Overweight";
				Category = overweight;
			}
			else {
				String obese = "Obese";
				Category = obese;
			}
		  
		  System.out.println();
		  System.out.println("-------BMI Calculator------");
		  System.out.println("Name: "+name);
		  System.out.println("Height (m): "+MetricHeight);
		  System.out.println("Weight (kg): "+ KiloWeight);
		  System.out.println("BMI: "+BMI);
		  System.out.println("Category: "+Category);
		  



		  
		  
		  
	  
		  
		  
		  
	  }
}
