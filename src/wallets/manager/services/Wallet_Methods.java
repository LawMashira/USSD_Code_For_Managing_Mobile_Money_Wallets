package wallets.manager.services;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Wallet_Methods {
	
	// Methods managing the wallet
	
	double balance;
	private static final DecimalFormat df = new DecimalFormat("0.00");
	 public  double checkBalance() {
			
			return balance;
		   }
	
	 public void cashIn(double amount) {
		 System.out.println("How much do you want to cash in?");
		 df.setRoundingMode(RoundingMode.UP);
		 Scanner scan = new Scanner (System.in);
		 
		 amount = scan.nextDouble();
		
		 System.out.println("You have successifully topped your account with $ ZWL "+ amount);
		 balance = balance + amount;
		 
		//scan.close();
	 }
	 public void cashOut(double amount) {
		 System.out.println("How much do you want to cash out?");
		 Scanner scan = new Scanner (System.in);
		 amount = scan.nextDouble();
		// scan.close();
		 if(balance>amount) {
			 System.out.println("You have successifully cashed out $ ZWL "+ amount);
		 balance = balance - amount;
		 } else {
			 System.out.println("You have insuffient amount to make that cash out. Recharge your wallet.");
		 }
		 
	 }
		 public void exitApp() {
			 System.exit(0);
		    }
		 public void transferMoney(double amount) {
			 System.out.println("How much do you want to transfer?");
			
			 Scanner scan = new Scanner (System.in);
			 amount = scan.nextDouble();
			 System.out.println("Enter reciever number");
			 long receiverNumber = scan.nextLong();
			// scan.close();
			 if(balance> amount) {
			 double transferMoney=  amount;
			 System.out.println("You have successifully transferred $ ZWL" + transferMoney + " to " + receiverNumber  );
			 balance = balance - amount;
			 }else {
				 System.out.println("Insufient funds cannot make this transfer.");
			 }
			 
			 
			 }
		 public void makePayment() {
			 
		    }
		 public void billerCode(double amount) {
			
			 System.out.println("Enter biller code:");
			 Scanner scan = new Scanner (System.in);
			 int billerCode= scan.nextInt();
			 System.out.println("Enter amount to be paid");
			 amount = scan.nextDouble();
			 double amountPayment = amount;
			 if(balance>amount) {
			 System.out.println("You have successifully paid $ ZWL" + amountPayment + " to " + billerCode);
			 balance = balance - amount;
					 } else {
						 System.out.println("Insufient funds to make this payment.");
					 }
			 }
		 public void buyBundles() {
				
		   }
		 
			public void buyAirTime() {
				
			   }
			// bundle
			public void myNumberBundle(double amount) {
				long  myNumber = 713355308;
				System.out.println("Enter amount");
				 Scanner scan = new Scanner (System.in);
				 amount =scan.nextDouble();
				 if(balance> amount) {
			myNumber= (long)amount;
			balance = balance- amount;
			System.out.println("You have successifully recharged your number with $ ZWL " + amount); 
			
				 } else {
				 System.out.println("Insufient funds to buy airtime.");
				 }
			  }
			
			
			
			public void myNumber(double amount) {
				long  myNumber = 713355308;
				System.out.println("Enter amount");
				 Scanner scan = new Scanner (System.in);
				 amount =scan.nextDouble();
				 if(balance> amount) {
			myNumber= (long)amount;
			balance = balance- amount;
			
			System.out.println("You have successifully recharged your number with $ ZWL " + amount); 
				 } else {
				 System.out.println("Insufient funds to buy airtime.");
				 }
			  }
			public void otherNumber(double amount) {
				System.out.println("Enter the number");
				 Scanner scan = new Scanner (System.in);
				 long otherNumber = scan.nextLong();
				System.out.println("Enter amount");
				
				 amount =scan.nextDouble();
				 double buy=amount;
				 
				 if(balance> amount) {
			
			balance = balance- amount;
			System.out.println("You have successifully recharged number " +otherNumber+ " with $ ZWL " + buy); 
			otherNumber = (long) amount;
				 } else {
				 System.out.println("Insufient funds to buy airtime.");
				 }
			  }
		 }
 
	 



