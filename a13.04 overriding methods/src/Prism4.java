/**
 * This class defines a Prism object by extending
 * Box 
 * The toString method has been added.
 *
 * @author Will English
 * @version 04/2/18
 */
public class Prism4 extends Box4
{

	public Prism4(int l, int w, int h) 
	{
		super(l, w, h);
	}
	public String toString()
	{
        return "Prism- " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
}
