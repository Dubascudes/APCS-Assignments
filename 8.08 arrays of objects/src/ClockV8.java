
/**
 * The purpose of this program is to calculate the difference
 * in 2 times given in hours, and find that difference in minutes,
 * and neatly output the results.
 *
 * @author Will English
 * @version 11/1/17
 */

class ClockV8
{
    private String Name;
    private double time1 = 0, time2 = 0;
    
    //default constructor
    public ClockV8(String name, int t1, int t2)
    {
    	Name = name;
    	time1 = t1;
    	time2 = t2;
    }
    //getter method for Name
    public String getName(){
    	return Name;
    }
    public double getT1(){
    	return time1;
    }
    public double getT2(){
    	return time2;
    }
    //calculate time difference
    public double timeDif()
    {
        return Math.abs(time1-time2);
    }
    //calculate minutes
    public double mins(double hrs)
    {
        return hrs*60;
    }
    
}