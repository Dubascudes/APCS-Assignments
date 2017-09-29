
/**
 * Purpose of Program is to convert a quantity of one currency into a quantity of another currency with the same value
 *
 * @version 6/25/17
 * @author Will English
 */

/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Will English
 * @version 06/29/17
 */
public class CurrencyV2
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 17.97098;     // 1 US dollar = 17.97098 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        
        double rublesSpent = 11700.95;            // Russian Rubles spent
        double rubleExchangeRate = 59.34754;     // 1 US dollar = 59.34754 rubles
        double dollarsSpentInRussia = 0.0;      // US dollars spent in Russia
        double dollarsAfterRussia = 0.0;        // US dollars remaining after Russia
        
        double eurosSpent = 2950.73;            // German euros spent
        double euroExchangeRate = 0.875900;     // 1 US dollar = 0.875900 euros
        double dollarsSpentInGermany = 0.0;      // US dollars spent in Germany
        double dollarsAfterGermany = 0.0;        // US dollars remaining after Germany
        //remaining variables below here

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        //Mexico
        dollarsSpentInMexico = pesosSpent / pesoExchangeRate;
        dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
        
        //Russia
        dollarsSpentInRussia= rublesSpent / rubleExchangeRate;
        dollarsAfterRussia = dollarsAfterMexico - dollarsSpentInRussia;
        
        //Germany
        dollarsSpentInGermany = eurosSpent / euroExchangeRate;
        dollarsAfterGermany = dollarsAfterRussia - dollarsSpentInGermany;
        // code goes below here
        

        System.out.println("Starting USD: "+startingUsDollars);
        System.out.println();
        System.out.println("Mexico: ");
        System.out.println("Pesos spent: "+pesosSpent);
        System.out.println("USD equivalent: "+ dollarsSpentInMexico);
        System.out.println("USD remaining: "+ dollarsAfterMexico);

        System.out.println();
        System.out.println("Russia: ");
        System.out.println("Rubles spent: "+rublesSpent);
        System.out.println("USD equivalent: "+ dollarsSpentInRussia);
        System.out.println("USD remaining: "+ dollarsAfterRussia);

        System.out.println();
        System.out.println("Germany: ");
        System.out.println("Euros spent: "+eurosSpent);
        System.out.println("USD equivalent: "+ dollarsSpentInGermany);
        System.out.println("USD remaining: "+ dollarsAfterGermany);
        System.out.println("======================================");
        System.out.println("Remaining USD: "+ dollarsAfterGermany);
        System.out.println();
        System.out.println();



        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1 / costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = budget2 / (int)costItem2; 	//how many items can be purchased
		double fundsRemaining2 = budget2 / costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
