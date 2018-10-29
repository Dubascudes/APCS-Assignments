/**
 * English concrete class for the Homework class hierarchy
 * 
 * 
 * @author Will English
 * @version 4/3/18
 * 
 */
public class EnglishHW extends Homework
{
	public EnglishHW()
	{

		super();
	}
	
	public void init(int pages)
	{
		this.setPages(pages);
		this.setType("English");
	}
	public String toString()
	{
		return getType()+"- read "+getPages()+" pages";
	}
}

