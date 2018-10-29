/**
 * StudentData class organizes some student grades, determines letter grades, and sets a first and last name
 * 
 * @author Will English
 * @version 05/27/18
 */
public class StudentData 
{
	private String firstName;
	private String lastName;
	private double [] scores;
	private String grade;
	
	public StudentData(String first, String last, double [] scores)
	{
		firstName = first;
		lastName = last;
		this.scores = scores;
		this.grade = grader(scores);
        if (firstName.length() < 1)
            throw new IllegalArgumentException("First name cannot be empty");
        if (lastName.length() < 1)
            throw new IllegalArgumentException("Last name cannot be empty");

	}
	public String grader(double [] arr)
	{
		String newGrade = "";
		double avg = 0;
		for(double x : arr)
		{
			avg += x;
		}
		avg/=arr.length;
		
        if (avg >= 90)
        	newGrade = "A";
        else if (avg >= 80)
        	newGrade = "B";
        else if (avg >= 70)
        	newGrade = "C";
        else if (avg >= 60)
        	newGrade = "D";
        else
        	newGrade = "F";  
		return newGrade;	
	}
	public String printScores()
	{
        String str = "";
        for (double score : scores) {
            str = str + score + " ";
        }
        return str;
    }
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public double[] getScores()
	{
		return scores;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setFirstName(String name)
	{
		firstName = name;
	}
	public void setLastName(String name)
	{
		lastName = name;
	}
	public void setScores(double [] scores)
	{
		this.scores = scores;
	}
	public void setGrade(String grade)
	{
		this.grade = grade;
	}
	public String toString()
	{
		return firstName+" "+lastName+": "+grade+"- "+printScores();
	}
}
