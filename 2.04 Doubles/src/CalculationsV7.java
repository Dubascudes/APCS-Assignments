
/**
 * 02.04 Primitive Data Types
 * 
 * displays a bunch of operations using integers and doubles
 * 
 * @version 6/25/17
 * @author Will English
 * 
 */

public class CalculationsV7
{
	// Declare integer variables
	static int iNum1 = 25;
	static int iNum2 = 9;
	static int iNum3 = 11;

	// Declare double variables
	static double dNum1 = 43.21; 
	static double dNum2 = 3.14;
	static double dNum3 = 10.0;
	
    public static void main(String[ ] args)
    {
    	// Addition 
    	System.out.println("Addition");
    	System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
    	System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
    	System.out.println();
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3+" - "+iNum2+" - "+iNum1+" = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2+" - "+dNum3+" = "  + (dNum2 -dNum3 ));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1+" * "+iNum2+" = " + (iNum1 * iNum2 )); 
        System.out.println(dNum2+" * "+dNum3+" * "+dNum3+" = " + (dNum2  * dNum3 * dNum3 ));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2+" / "+iNum1+" = " + (iNum2/ iNum1 ));
        System.out.println(dNum1+" / "+dNum3+" = " + (dNum1 / dNum3 ));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3+" % "+iNum2+" = " + (iNum3 % iNum2 ));
        System.out.println(dNum3+" % "+dNum2+" = " + (dNum3 % dNum2 ));
        System.out.println();
        
        
        // 2.03 Additional int Equations
        System.out.println("2.03 Integer Operations");
        System.out.println(iNum1+" % "+iNum2+" * "+iNum3+" = " + (iNum1 % iNum2 * iNum3 ));
        System.out.println(iNum1+" / "+iNum3+" + "+iNum2+" = " + (iNum1 / iNum3 + iNum2));
        System.out.println(iNum2+" + "+iNum1+" * "+iNum3+" = " + (iNum2 + iNum1  * iNum3));

        //2.04 Additional double Equations
        System.out.println("2.04 Double Operations");
        System.out.println(dNum1+" % "+dNum3+" * "+dNum2+" = " + (dNum1 % dNum2 * dNum2 ));
        System.out.println(dNum2+" / "+dNum1+" + "+dNum3+" = " + (dNum2 / dNum1 + dNum3 ));
        System.out.println(dNum2+" + "+dNum3+" * "+dNum1+" = " + (dNum2 + dNum3  * dNum1));

               
    } // end of main method
} // end of class