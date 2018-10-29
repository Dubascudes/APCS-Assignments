
/**
 * This class defines a Tesseract object using
 * Cube class. Time dimension has been added.
 * The toString method has been added.
 *
 * @author Will English
 * @version 04/2/18
 */
public class Tesseract4 extends Cube4
{
	private int time;
	public Tesseract4( int w,  int t) 
	{
		super(w);
		time = t;
	}
	
	public int getTime()
	{
		return time;
	}

    public String toString()
    {
        return "Tesseract- " + getLength() + " X " + getWidth() + " X " + getHeight() + " X " + time;
    }
}
