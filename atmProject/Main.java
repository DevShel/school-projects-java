package atmProject;
import java.util.Scanner;
import java.util.*;


class Main 
{
  public static void main(String[] args) 
  
  {
    ArrayList<Double> ATM = new ArrayList<Double>();

		ArrayList<Integer> Account = new ArrayList<Integer>();

		Scanner scan = new Scanner(System.in);
		boolean Q = true;

		System.out.println("Enter your account number: ");
		System.out.println(" ");
		int accountNumber = scan.nextInt();
		Account.add(accountNumber);

		System.out.println("Enter your 4-digit pin password: ");
		System.out.println(" ");
		int accountPin = scan.nextInt();
		Account.add(accountPin);
		double savingsBalance = 500.25;
		double checkingBalance = 50.50;
		ATM.add(savingsBalance);
		ATM.add(checkingBalance);


		System.out.println("Savings Account Balance = " + ATM.get(0));
		System.out.println(" ");
		System.out.println("Checking Account Balance = " + ATM.get(1));
		System.out.println(" ");

		while( Q == true)
		{
			System.out.println("Please select from the menu below.");
			System.out.println(" ");
			System.out.println("(D)eposit (W)ithdrawal (B)alances (Q)uit item?: ");
			System.out.println(" ");
			String choice = scan.nextLine();
			if(choice.equals("Q"))
			{
				Q = false;
			}
			else if(choice.equals("D"))
			{
				System.out.print("Deposit into (C)hecking or (S)avings account? ");
				String Deposit = scan.nextLine();
				System.out.println(" ");
				if(Deposit.equals("C"))
				{
					System.out.print("How much is your deposit? ");
					System.out.println(" ");
					double depositAmt = scan.nextDouble();    
					ATM.set(1,ATM.get(1)+depositAmt);
					System.out.println("Your Checking account balance has been updated.");    
					System.out.println(" ");                                                            
				}
				else if(Deposit.equals("S"))
				{
					System.out.print("How much is your deposit? ");
					System.out.println(" ");
					double depositAmt = scan.nextDouble();    
					ATM.set(0,ATM.get(0) + depositAmt);
					System.out.println("Your Savings account balance has been updated.");    
					System.out.println(" ");


				}
				else if (choice.equals(null))
				{
					System.out.println("Exeception");  
					System.out.println(" ");
				} 
				else 
				{
					System.out.println("Invalid Input");
					System.out.println(" "); 
				}
			}

			else if(choice.equals("W"))
			{
				System.out.print("Withdraw into (C)hecking or (S)avings account? ");
				System.out.println(" ");
				String Deposit = scan.nextLine();
				if(Deposit.equals("C"))
				{
					System.out.print("How much is your wtihdrawal? ");
					System.out.println(" ");
					double wita = scan.nextInt();   
					if(wita<=checkingBalance)
					{
						ATM.set(1,ATM.get(1) - wita);
						System.out.println("Your Checking account balance has been updated."); 
						System.out.println(" ");
					} 
					else
					{
						System.out.println("Balance must be greater then withdrawal error."); 
						System.out.println(" ");
					}
				                                                             
				}
				else if(Deposit.equals("S"))
				{
					System.out.print("How much is your wtihdrawal? ");
					System.out.println(" ");
					double wita = scan.nextInt();   
					if(wita<=savingsBalance)
					{
						ATM.set(0,ATM.get(0) - wita);
						System.out.println("Your Checking account balance has been updated."); 
						System.out.println(" ");
					} 
					else
					{
						System.out.println("Balance must be greater then withdrawal error."); 
					}


				}
				else
				{
					System.out.println("Invalid Input"); 
				}
			}
			else if(choice.equals("B"))
			{
				System.out.println("Savings Account Balance = " + ATM.get(0));
				System.out.println(" ");
				System.out.println("Checking Account Balance = " + ATM.get(1));
				System.out.println(" ");

			}
			else
			{
				System.out.println("Invalid Input"); 
			}

  }
}
}