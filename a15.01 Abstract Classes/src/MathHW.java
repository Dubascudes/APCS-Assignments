/**
 * Math concrete class for the Homework class hierarchy
 * 
 * 
 * @author Will English
 * @version 4/3/18
 * 
 */
public class MathHW extends Homework
{

	public MathHW()
	{

		super();
	}
	
	public void init(int pages)
	{
		this.setPages(pages);
		this.setType("Math");
	}
	public String toString()
	{
		return getType()+"- read "+getPages()+" pages";
	}
}
