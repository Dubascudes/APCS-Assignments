

/**
 * This class is a tester class for the other shape classes.
 *
 * @author Will English
 * @version 04/2/18
 */

public class ShapeTester 
{

	public static void showEffectBoth(Box4 a, Box4 b)
	{
		if(a.equals(b)) System.out.println(a.toString()+" IS the same as "+ b.toString());
		else System.out.println(a.toString()+" IS NOT the same as "+ b.toString());

	}
	
	public static void main (String [] args)
	{
		Rectangle4 rect = new Rectangle4(5,8);
		Box4 box1 = new Box4(5,8,2);
		Box4 box2 = new Box4(5,5,5);
		Cube4 cube = new Cube4(5);
		Tesseract4 tess = new Tesseract4(5,8);
		Prism4 prism = new Prism4(5,3,20);
		
		System.out.println("My shapes:");

		System.out.println(rect.toString());
		System.out.println(box1.toString());
		System.out.println(box2.toString());
		System.out.println(cube.toString());
		System.out.println(tess.toString());
		System.out.println(prism.toString());

		System.out.println();

		System.out.println("Test for quality:");
		showEffectBoth(box1,box2);
		showEffectBoth(box2,cube);


	}
	
}
