
/**
 * This class defines a Cube object using
 * only one integer for each dimension.
 * The toString method has been added.
 *
 * @author Will English
 * @version 04/2/18
 */
public class Cube4 extends Box4 {

	public Cube4(int w)
	{
		super(w, w, w);
	}

	public String toString()
	{
        return "Cube- " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
	
}
