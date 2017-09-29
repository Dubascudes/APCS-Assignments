/** The BuyTicket class is meant to simulate a purchase of movie tickets with different names and costs
 * 
 * @author Will English
 * @version 8/3/17
 * 
 */
import java.util.Scanner;

public class BuyTicket {
	
	  public static void main(String[ ] args) 
	  {
		  Scanner in = new Scanner(System.in);
		  
		  //Local variables
		  String shopperName = "";
		  String date = "";
		  String itemName = "";
		  int quantity = 0;
		  int price = 0;   //parse to double 
		  String cardNumber = "";
		  String cardPin = "";
		  String cardExpDate = "";
		  String cardCVV = "";
		  
		  System.out.println("			Generic Cinema Theaters");
		  
		  System.out.print("Full Name: ");
		  shopperName = in.nextLine();
		  System.out.println();

		  System.out.print("Date(mm/dd/yyyy): ");
		  date = in.nextLine();
		  System.out.println();

		  System.out.print("Movie: ");
		  itemName = in.nextLine();
		  System.out.println();

		  System.out.print("Number of Tickets: ");
		  quantity = in.nextInt();
		  System.out.println();

		  System.out.print("Price: ");
		  price = in.nextInt();
		  System.out.println();

		  System.out.print("Card Number(****-***-****): ");
		  cardNumber  = in.nextLine();
		  System.out.println();

		  System.out.print("Card Pin(****): ");
		  cardPin = in.nextLine();
		  System.out.println();

		  System.out.print("Card Expiration Date(**/**): ");
		  cardExpDate = in.nextLine();
		  System.out.println();

		  System.out.print("CVV(***)2: ");
		  cardCVV = in.nextLine();
		  System.out.println();

		  
		  int subtotal = price*quantity;
		  double total = subtotal + (subtotal*.065);

		  
		  System.out.println();
		  System.out.println("*******************************************");
		  System.out.println("				  Reciept					");
		  System.out.println("*******************************************");
		  System.out.println();
		  //generate reciept number
		  //date in = m/d/y date out / = -
		  //credit card number modify
		  System.out.println("Date: "+date);
		  System.out.println("Name: "+shopperName);
		  System.out.println("Title: " +itemName);
		  System.out.println("# of Tickets: "+quantity);
		  System.out.println("Price: "+price);
		  System.out.println("Sub-total: "+subtotal);
		  System.out.println();
		  System.out.println("Total: "+total);



	  }	
	
}
