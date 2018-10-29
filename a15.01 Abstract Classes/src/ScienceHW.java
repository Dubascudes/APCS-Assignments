/**
 * Science concrete class for the Homework class hierarchy
 * 
 * 
 * @author Will English
 * @version 4/3/18
 * 
 */
public class ScienceHW extends Homework 
{
	public ScienceHW()
	{
		super();
	}
	
	public void init(int pages)
	{
		this.setPages(pages);
		this.setType("Science");
	}
	public String toString()
	{
		return getType()+"- read "+getPages()+" pages";
	}
}