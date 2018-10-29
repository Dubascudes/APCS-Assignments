import java.util.ArrayList;
public class Tester 
{

	static String showCenter(Circle2 x){
		return "For this "+x.getName()+" "+x.getCenter();
	}
	
	public static void main (String [] args)
	{
		ArrayList<Circle2> circles = new ArrayList(4);
		Circle2 circ = new Circle2(2,4,3);
		Cylinder2 cyl = new Cylinder2(2,5,6,3);
		Oval2 oval = new Oval2(2,6,4,3);
		OvalCylinder2 ovcyl = new OvalCylinder2(2,4,6,8,10);
		
		circles.add(circ);
		circles.add(cyl);
		circles.add(oval);
		circles.add(ovcyl);

		for(int x = 0; x < circles.size(); x++){
			System.out.println(showCenter(circles.get(x))
					);
		}
		
	}
}
