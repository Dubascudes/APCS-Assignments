/**
 * Purpose of Program: Calculates TDEE based on BMR and Activity level.
 * @author Will English
 * @version 8/6/2017
 */
import java.util.Scanner;
public class TDEE {
	public static void main(String args[]){
		
		//local variables
		String name = "";
		String sex = "m";
		String BMR = "";
		Scanner in = new Scanner(System.in);
		String level = "a";
		String activityFactor = "0";
		
		System.out.print("Please enter your name: ");
		name = in.nextLine();
		System.out.println();
		System.out.print("Please enter your sex(m/f): ");
		sex = in.nextLine();
		System.out.println();
		System.out.print("Please enter your BMR: ");
		BMR = in.nextLine();
		System.out.println();
		

		
		//menu
		System.out.println("Please enter the letter corresponding to your activity level ");
		System.out.println("A.Resting- Sleeping, reclining	) ");
		System.out.println("B. Sedentary-	Minimal movement, mainly sitting/lying down (e.g., watching TV, reading, etc.)");
		System.out.println("C. Light-	Office work, sitting (e.g., walking, laundry, walking on level ground at 2.5 – 3.0 mph).");
		System.out.println("D. Moderate- Light manual labor (e.g., dancing, cycling, gardening, etc.) ");
		System.out.println("E. Very Active- Hard manual labor (e.g., team sports, climbing, agricultural labor, etc.)");
		System.out.println("F- Extremely Active- Heavy manual labor (e.g., full-time athletes, construction workers, etc.)");
		System.out.print("Letter: ");
		level = in.nextLine();
		
		//logic
		
		if(sex.equals("m") || sex.equals("M")){
			if(level == "a" || level =="A"){
				activityFactor = "1.0";
			}
			else if(level.equals("b") || level.equals("B")){
				activityFactor ="1.3";
			}
			else if(level.equals("c") || level.equals("C")){
				activityFactor ="1.6";
			}
			else if(level.equals("d") || level.equals("D")){
				activityFactor ="1.7";
			}
			else if(level.equals("e") || level.equals("E")){
				activityFactor ="2.1";
			}
			else if(level.equals("f") || level.equals("F")){
				activityFactor ="2.4";
			}
			else{
				System.out.println("Incorrect choice. Terminating program.");
			}
			sex = "male";
		}
		
		else if(sex.equals("f") || sex.equals("F")){
			if(level.equals("a") || level.equals("A")){
				activityFactor ="1.0";
			}
			else if(level.equals("b") || level.equals("B")){
				activityFactor ="1.3";
			}
			else if(level.equals("c") || level.equals("C")){
				activityFactor ="1.5";
			}
			else if(level.equals("d") || level.equals("D")){
				activityFactor ="1.6";
			}
			else if(level.equals("e") || level.equals("E")){
				activityFactor ="1.9";
			}
			else if(level.equals("f") || level.equals("F")){
				activityFactor ="2.2";
			}
			else{
				System.out.println(activityFactor);
			}
			sex = "Female";
		}
		else{
			System.out.println("Incorrect choice. Terminating program.");
		}

		
		//calculations
		double TDEE = Integer.parseInt(BMR) * Double.parseDouble(activityFactor);
		
		System.out.println();
		System.out.println("Results: ");
		System.out.println();
		System.out.print("Name: "+name+"\t\t");
		System.out.println("Sex: "+sex);
		System.out.print("BMR: "+BMR+"\t\t");
		System.out.println("Activity Factor: "+activityFactor);
		System.out.println("TDEE: "+TDEE);

				
				
	}
}
