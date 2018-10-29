public class ClockV8Tester {
	//main method
    public static void main(String[] args)
    {
    	double avg = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        ClockV8[] clock = {new ClockV8("Will",2,8), new ClockV8("Ellee",1,9), new ClockV8("Luke",3,7), new ClockV8("Mike", 2, 8)};
        

        
       //print results
        System.out.printf("%30s", "Time Trials");
        System.out.printf("%10s%10s%10s%25s%25s", "\nName","Time 1","Time 2","Difference in Hours","Difference in Minutes" );
        System.out.printf("%30s", "\n=====================================================================\n");
        for(int index = 0; index<clock.length; index++){
        	avg+=clock[index].timeDif();
        	System.out.printf("%-10s%-10.6s%5.6s%15.6s%25.7s\n", clock[index].getName(),Double.toString(clock[index].getT1()),Double.toString(clock[index].getT2()),Double.toString(clock[index].timeDif()),Double.toString(clock[index].mins(clock[index].timeDif())) );
    	}
        avg/=clock.length;
        for(int index = 0; index<clock.length; index++){
        	if(clock[index].timeDif()>max){
        		max = clock[index].timeDif();
        	}
        	if(min>clock[index].timeDif()){
        		min = clock[index].timeDif();
        	}
        }
        System.out.println("=====================================================================");
    	System.out.printf("%29s%11.5s%25.5s\n", "Maximum: ", Double.toString(max), Double.toString(max*60) );
    	System.out.printf("%29s%11.5s%25.5s\n", "Minimum: ", Double.toString(min), Double.toString(min*60) );
    	System.out.printf("%29s%11.5s%25.5s\n", "Average: ", Double.toString(avg), Double.toString(avg*60) );

    	//Double.toString(
        }//end main method
}//end class
