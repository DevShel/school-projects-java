package bankAccountProject;

import java.util.Scanner;

class Main 
{

	public static void main(String[] args)
	{
		

		double balance = 1000.00;
		System.out.println("Your balance is " + balance + " USD." );
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to make a “Deposit” or “Withdrawal”? ");
		String bankAction = input.nextLine();
		if (bankAction.equals("Withdrawal"))
		{
			bankMethods.withdrawal(balance);
		}
		
		if (bankAction.equals("Deposit"))
		{
			bankMethods.deposit(balance);
		}
		input.close();

	}
}