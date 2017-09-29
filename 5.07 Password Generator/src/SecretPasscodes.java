import java.util.* ;
import java.io.*;
public class SecretPasscodes {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException{
		
		//local variables
		String password = "";
		int choice = 0;
		int count = 0;
		int loop;
		Random rand = new Random();
		int length = 0;
		Scanner in = new Scanner(System.in);
		File filename = new File("passcodes.txt");
		PrintWriter outFile = new PrintWriter(filename);

//=============================menu===============================
		
		System.out.println("===============Passsword Generator===============");
		System.out.println("=[1] Lowercase Letters\t\t\t\t=");
		System.out.println("=[2] Upper and Lowercase Letters\t\t=");
		System.out.println("=[3] Upper and Lowercase Letters and Numbers\t=");
		System.out.println("=[4] Numbers and Special Characters**\t\t=");
		System.out.println("=[5] Exit \t\t\t\t\t=");
		System.out.println("=\t\t\t\t\t\t=");
		System.out.println("=\t\t\t\t\t\t=");
		System.out.println("=   ** Excludes ! \" # $ % & ' ( ) * ` - . / \t=");
		System.out.println("=================================================");
		System.out.println("");
		System.out.println("");
		
		
//==========================Selection=======================================
		while(choice != 5){
		System.out.print("Enter Selection (1-5): ");
		choice = in.nextInt();
		while(choice <1 || choice >5) {
			System.out.print("Invalid selection. Please re-enter your choice: ");
			choice = in.nextInt();
		}
		if(choice<5){
		System.out.print("Password Length (More than 6): ");
		length = in.nextInt();
		}
		while(length<6) {
			System.out.print("Invalid selection. Please re-enter your choice: ");
			length = in.nextInt();
		}
		
		
		
//====================================Choices===========================================
		
				if (choice == 1) {
					
					for (int i = 0; i < length; i++) {
						password += (char)(rand.nextInt(26)+97);
					}
					
				}
		
				else if (choice == 2) {
					
					for (int i = 0; i < length; i++) {
						
						loop = rand.nextInt(2);
						
						if (loop == 0) {
							password += (char)(rand.nextInt(26)+97);
						}
						else if (loop == 1) {
							password += (char)(rand.nextInt(25)+65);
						}
					}
					
				}
				else if (choice == 3) {
					
					for (int i = 0; i < length; i++) {
						
						loop = rand.nextInt(3);
						
						if (loop == 0) {
							password += (char)(rand.nextInt(26)+97);
						}
						else if (loop == 1) {
							password += (char)(rand.nextInt(25)+65);
						}
						else if (loop == 2) {
							password += (char)(rand.nextInt(9)+48);
						}
					}
					
				}
				else if (choice == 4) {
					
					for (int i = 0; i < length; i++) {
						
						loop = (char)rand.nextInt(2);
						
						if (loop == 0) {
							password += (char)(rand.nextInt(9)+48);
						}
						else if (loop == 1) {
							password += (char)(rand.nextInt(9)+91);
						}

					}
					
				}
				outFile.println(password);
				password = "";
		}
		outFile.close();
		if (choice == 5) {
		System.out.println("Thank you for using Password Generator");
		}




		//===============output======================== 

		Scanner inFile = new Scanner(filename );
		System.out.print("Generating Passcode");
		while(count<4){
		Thread.sleep(500);
		System.out.print(".");
		count++;
		}
		
		
		System.out.println("");
		System.out.println("Passcodes: ");
		while (inFile.hasNext()){
			String token = inFile.next();
			System.out.println(token);
		//	System.out.println(token);

		}
		in.close();
		outFile.close();
		inFile.close();		}
	}
