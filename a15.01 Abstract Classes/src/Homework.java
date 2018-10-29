/**
 * Homework super/abstract class for the Homework class hierarchy
 * 
 * 
 * @author Will English
 * @version 4/3/18
 * 
 */
public abstract class Homework
	{
	private int numPages;
	private String type;
		public Homework()
		{ 
			this.numPages = 0;
			this.type = "none";
		}
		
		public abstract void init(int pages);
	
		public int getPages()
		{
			return numPages;
		}
		
		public void setPages(int x)
		{
			this.numPages = x;
		}
		public void setType(String x)
		{
			this.type = x;
		}
		public String getType()
		{
			return this.type;
		}
}
