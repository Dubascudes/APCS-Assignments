import java.util.Scanner;
/*
 * @author Will English
 * @version 8/28/17
 * purpose- take user input to accordingly format output
 * 
 * 
 */


class AnnualWeatherV2 {

	public static void main(String[] args) {
        //local variables
        Scanner in = new Scanner(System.in);
        String city = "Tallahassee";
        String state = "Florida";
        String f = "F";
        String c = "C";
        String inches = "Inches";
        String cm = "cm";
        String choiceLength = "";
        String precipUnit = "";
        String tempUnit = "";
        String choiceTemp = "";

        String[] months = {"Jan.","Feb.","Mar.","Apr.","May.","Jun.","Jul.","Aug.","Sep.","Oct.","Nov.","Dec."};
        double[] temp = {58.1, 65.1, 72.8, 74.9, 73.9, 80.6, 83.4, 84.4, 82.6, 79.3, 76.2, 74.4};
        double[] precp = {1.5, 1.9, 2.2, 2.7, 3.5, 6.5, 7.8, 8.3, 7.2, 6.8, 5.3, 3.7};
      // double[] temp2 = {65.4, 66.8, 71.5, 75.9, 79.0, 80.3, 81.6, 82.4, 81.4, 80.6, 78.4, 74.2 };
      // double[] precp2 = {2.4 ,1.5 ,2.5 ,3.6 ,4.5, 5.4, 5.6, 7.6, 6.7, 8.7, 7.4, 8.9};
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        choiceTemp = in.nextLine();
        System.out.print("Choose the precipitation scale (I = Inches, CM = Centimeteres): ");
        choiceLength = in.nextLine();
        System.out.println();
        System.out.println();
        if (choiceTemp.equalsIgnoreCase("F")) {
        	tempUnit = "F";
        }
        else if (choiceTemp.equalsIgnoreCase("C")) {
        	for (int i=0; i<12; i++) {
                temp[i] = temp[i]-32;
                temp[i] = (.555)*(temp[i]);
                temp[i] = ((temp[i]*10));
                temp[i] = ((int)temp[i]);
                temp[i] = temp[i]/10;
        	}
        	tempUnit = "C";
        }
        
        if (choiceLength.equalsIgnoreCase("i")) {
        	precipUnit = "in.";
        }
        else if (choiceLength.equalsIgnoreCase("cm")) {
        	for (int i=1; i<12; i++) {
        		precp[i] = precp[i] * 2.54;
        		precp[i] = precp[i] * 10;
        		precp[i] = ((int)precp[i]);
        		precp[i] = precp[i] / 10;
        	}
        	precipUnit = "cm.";
        }
        
        double sum=0.0;
        
        for(int i=0; i<12; i++) 
        {
            sum=sum+temp[i];
        }
        
        double avgTemp = sum/12;
        avgTemp = ((avgTemp*10));
        avgTemp = ((int)avgTemp);
        avgTemp = avgTemp/10;
        sum = 0.0;
        
        for(int i=0; i<12; i++) 
        {
            sum=sum+precp[i];
        }
        
        double avgPrecip = (sum*10);
        avgPrecip = (int)avgPrecip;
        avgPrecip = avgPrecip/10;
        
        System.out.printf("%35s\n", "Climate Data");
        System.out.printf("%45s\n", "Location: " + city + ", " + state);
        System.out.println();
        System.out.printf("%8s%18s%24s\n", "Month", "Temperature " + tempUnit, "Precipitation " + precipUnit);
        System.out.println("*****************************************************");
        
        for(int i=0; i<12; i++) 
        {
            System.out.printf("%8s%13s%20s\n", months[i], temp[i], precp[i]);
        }
        
        System.out.println("*****************************************************");
        System.out.printf("%8s%18s\n", "Average: " + avgTemp , "Annual: " + avgPrecip); 
    }
    
}
