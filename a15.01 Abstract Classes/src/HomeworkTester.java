/**
 * Client class for the Homework class hierarchy
 * 
 * 
 * @author Will English
 * @version 4/3/18
 * 
 */


import java.util.ArrayList;
public class HomeworkTester 
{
	public static void main(String[] args)
	{
		
		ArrayList<Homework> hw = new ArrayList();
	
		hw.add(new MathHW());
		hw.add(new ScienceHW());
		hw.add(new HistoryHW());
		hw.add(new EnglishHW());
		
		System.out.printf("%30s","My Homework Reading To-Do\n");
		System.out.printf("%30s","----------------------------\n");

		
		for(Homework i : hw)
		{
			int pages = ((int)(15*Math.random()))+2;
			i.init(pages);
			System.out.println(i);
		}
	}
}
