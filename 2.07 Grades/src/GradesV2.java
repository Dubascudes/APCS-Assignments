/**
 * The purpose of this program is to calculate average of grades
 * 
 * 
 * @author Will English 
 * @version 06/16/17
 */
public class GradesV2 
{
	  public static void main(String[ ] args) 
	  {
		//local variables
		  int numTests = 0;      //counts number of tests
		  int testGrade = 0;     //individual test grade
		  int totalPoints = 0;   //total points for all tests 
		  double average = 0.0;  //average grade
	     
		  //grade 1
	        testGrade = 95;        
	        numTests++;
	        totalPoints += testGrade;
	        average = (double)totalPoints/numTests;
	        System.out.print("Test Number #" + numTests	);
	        System.out.print("   Test Grade: " + testGrade);   
	        System.out.print("   Total points: " + totalPoints);   
	        System.out.print("   Average Score: " + average);   
	        System.out.println();

	        //grade 2
	        testGrade = 73;        
	        numTests++;
	        totalPoints += testGrade;
	        average = (double)totalPoints/numTests;
	        System.out.print("Test Number #" + numTests	);
	        System.out.print("   Test Grade: " + testGrade);   
	        System.out.print("   Total points: " + totalPoints);   
	        System.out.print("   Average Score: " + average);  
	        System.out.println();

	        //grade 3
	        testGrade = 91;        
	        numTests++;
	        totalPoints += testGrade;
	        average = (double)totalPoints/numTests;
	        System.out.print("Test Number #" + numTests	);
	        System.out.print("   Test Grade: " + testGrade);   
	        System.out.print("   Total points: " + totalPoints);   
	        System.out.print("   Average Score: " + average);  
	        System.out.println();

	        
	        //grade 4
	        testGrade = 82;        
	        numTests++;
	        totalPoints += testGrade;
	        average = (double)totalPoints/numTests;
	        System.out.print("Test Number #" + numTests	);
	        System.out.print("   Test Grade: " + testGrade);   
	        System.out.print("   Total points: " + totalPoints);   
	        System.out.print("   Average Score: " + average);  
	        System.out.println();
		  
	        //grade 5
	        testGrade = 100;        
	        numTests++;
	        totalPoints += testGrade;
	        average = (double)totalPoints/numTests;
	        System.out.print("Test Number #" + numTests	);
	        System.out.print("   Test Grade: " + testGrade);   
	        System.out.print("   Total points: " + totalPoints);   
	        System.out.print("   Average Score: " + average);  
	        System.out.println();
	        
	        //grade 6
	        testGrade = 77;         
	        numTests++;
	        totalPoints += testGrade;
	        average = (double)totalPoints/numTests;
	        System.out.print("Test Number #" + numTests	);
	        System.out.print("   Test Grade: " + testGrade);   
	        System.out.print("   Total points: " + totalPoints);   
	        System.out.print("   Average Score: " + average);  
	        System.out.println();
    }//end of main method
}//end of class
