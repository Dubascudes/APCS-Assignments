/**
 *https://www.flvs.net/office The purpose of this program is to calculate average of grades based on a set of input
 * 
 * 
 * @author Will English 
 * @version 06/35/17
 */
import java.util.Scanner;         //imports Scanner methods

public class GradesV3
{
	  public static void main(String [] args)
	  {
		//local variables
		  String name;
		  int counter = 0;
		  int numTests = 0;      //counts number of tests
		  int testGrade = 0;     //individual test grade
		  int totalPoints = 0;   //total points for all tests 
		  Scanner kb = new Scanner(System.in);
		  //students name
		  System.out.print("Name: ");
		  name = kb.nextLine();
		  //how many grades?
		  System.out.print("How many grades do you want to average?");
		  numTests = kb.nextInt();
		  
		  while(numTests != 0){
			  counter++;
			  System.out.print("Test #"+counter);
			  System.out.print(" Score: " ); testGrade = kb.nextInt();totalPoints += testGrade;
		      System.out.print("Total points: " +totalPoints);
			  System.out.print("	Average: "+(double)totalPoints/counter);
			  System.out.println();
			  numTests--;
		  }
    }//end of main method
}//end of class
