package clock;

import java.util.Scanner;

/**
 * The purpose of this program is to calculate the difference
 * in 2 times given in hours, and find that difference in minutes,
 * and neatly output the results.
 *
 * @author Will English
 * @version 11/1/17
 */
public class ClockV3
{
    //default constructor
    public ClockV3()
    {
    }

    //calculate time difference
    public double timeDif(double t1, double t2)
    {
        return Math.abs(t1-t2);
    }
    //calculate minutes
    public double mins(double hrs)
    {
        return hrs*60;
    }

    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        double t1, t2, difHrs, difMins;

        //initialization of variables
        t1 = 0;
        t2 = 0;
        difHrs = 0;
        difMins = 0;
        Scanner in = new Scanner(System.in);
        ClockV3 clock = new ClockV3();
        
        //take input
        System.out.println("T1: ");
        t1 = in.nextDouble();
        System.out.println("T2: ");
        t2 = in.nextDouble();
        
        //call methods
        difHrs = clock.timeDif(t1,t2);
        difMins = clock.mins(difHrs);

        //print results
        System.out.printf("%30s", "Time Trials");
        System.out.printf("%10s%10s%25s%25s", "\nTime 1","Time 2","Difference in Hours","Difference in Minutes" );
        System.out.printf("%30s", "\n=============================================================\n");
        System.out.printf("%-10.2f%5.2f%15.2f%25.2f", t1,t2,difHrs,difMins );
        in.close();
    }//end main method
}//end class