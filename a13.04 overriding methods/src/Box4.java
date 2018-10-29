/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Will English
 * @version 04/2/18
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "Box-" + getLength() + " X " + getWidth() + " X " + height;
    }
    
    public boolean equals(Object x)
    {
    	if(!(x instanceof Box4)) return false;
    	Box4 box = (Box4) x;
    	return this.getLength() == box.getLength() && this.getWidth() == box.getWidth() && this.getHeight() == box.getHeight();
    	
    }
    
}