/**
 * History concrete class for the Homework class hierarchy
 * 
 * 
 * @author Will English
 * @version 4/3/18
 * 
 */
public class HistoryHW extends Homework
{

	public HistoryHW()
	{

		super();
	}
	
	public void init(int pages)
	{
		this.setPages(pages);
		this.setType("History");
	}
	public String toString()
	{
		return getType()+"- read "+getPages()+" pages";
	}
}


