package wallets.manager.services;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class USSD_Code {
		private static final DecimalFormat df = new DecimalFormat("0.00");

		public static void main(String[] args) {
			
			Wallet_Methods bal = new Wallet_Methods();
			
			// USSD code to be given as input :*151#
			
			System.out.println("PHONE USSD CODE: *151#");
			
			Scanner scan = new Scanner(System.in);
			String in = scan.nextLine();
			if( in.equals("*151#")) {
			 
				try {	 
					System.out.println("Enter password:");
				
				String pass = scan.nextLine();
				if(pass.equals("1990")) {
			System.out.println("--Welcome to Ecocash Services--");
			System.out.println("1.Cash In");
			System.out.println("2.Cash Out");
			System.out.println("3.Balance Enquiry");
			System.out.println("4.Transfer Money");
			System.out.println("5.Make Payment");
			System.out.println("6.Buy AirTime or Bundles ");
			System.out.println("7.Exit ");
		
			
			while(true) {
			
				int choice =0;
				
				choice = scan.nextInt();
				
			switch (choice) {
			
			case 1:
				bal.cashIn(0);
				df.setRoundingMode(RoundingMode.UP);
				   System.out.println("New Balance: $ ZWL"+ df.format(bal.checkBalance()));
				   break;
			case 2:
				   bal.cashOut(0);
				   df.setRoundingMode(RoundingMode.UP);
				   System.out.println("New Balance: $ ZWL"+df.format(bal.checkBalance()));
				   break;
			case 3:
				bal.checkBalance();
				df.setRoundingMode(RoundingMode.UP);
				System.out.println("Balance: $ ZWL"+df.format( bal.checkBalance()));
				break;
			case 4:
				bal.transferMoney(0);
				df.setRoundingMode(RoundingMode.UP);
				System.out.println("Balance: $ ZWL"+ df.format( bal.checkBalance()));
				break;
			case 5:
				bal.makePayment();
				System.out.println("1.Biller Code");
				System.out.println("2.Merchant");
				System.out.println("3.School");
				
			int option =0;
			option = scan.nextInt();
			switch(option) {
			case 1:
				bal.billerCode(0);
				df.setRoundingMode(RoundingMode.UP);
				System.out.println("Balance: $ ZWL"+ df.format( bal.checkBalance()));
				break;
			}
			break;
			
			case 6:
				System.out.println("1.Buy Airtime");
				System.out.println("2.Buy Bundles");
				int option1 =0;
				option1 = scan.nextInt();
				
				switch(option1) {
				case 1:
					bal.buyAirTime();
					
					System.out.println("1.My Number");
					System.out.println("2.Other Number");
					option = scan.nextInt();
					switch(option) {
					
					case 1:
						bal.myNumber(0);
						df.setRoundingMode(RoundingMode.UP);
						System.out.println("Balance: $ ZWL"+ df.format( bal.checkBalance()));
						break;
					case 2:
						bal.otherNumber(0);
						df.setRoundingMode(RoundingMode.UP);
						System.out.println("Balance: $ ZWL"+ df.format( bal.checkBalance()));
						break;
					}
					break;
				case 2:
					bal.buyBundles();
					
					System.out.println("1.My Number");
					System.out.println("2.Other Number");
					option = scan.nextInt();
					switch(option) {
					
					case 1:
						bal.myNumberBundle(0);
						df.setRoundingMode(RoundingMode.UP);
						System.out.println("Balance: $ ZWL"+ df.format( bal.checkBalance()));
						break;
					case 2:
						bal.otherNumber(0);
						df.setRoundingMode(RoundingMode.UP);
						System.out.println("Balance: $ ZWL"+df.format( bal.checkBalance()));
						break;
					}
					break;
				}
				
				break;
			case 7:
				System.out.print("Thank you for using Ecocash Services");
				bal.exitApp();
				
				break;
			
			default: 
					System.out.println("Please choose the correct option. ");
					break;
					
			  }
		}
			}else {
				 System.err.println("Incorrect password");
			   }
				} catch(Exception e) {
					System.out.print("Invalid entry");
				}

		 }
			
			 else {
			System.out.println("Connection Error or invalid USSD code");
		}

		}
	}


