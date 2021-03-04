package bankAccountProject;


import java.util.Scanner;

public class bankMethods
{

	public static void deposit(double balance)
	{

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount you would like to deposit : ");
		String depositAmt = input.nextLine();
		System.out.println((Double.parseDouble(depositAmt)));
		balance = balance + (Double.parseDouble(depositAmt));
		System.out.println("Your balance is " + balance + ".");
        input.close();
	}

	public static void withdrawal(double balance)
	{
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you would like to withdraw : ");
        String withdrawalAmt = input.nextLine();
        System.out.println((Double.parseDouble(withdrawalAmt)));
        input.close();
        if ((Double.parseDouble(withdrawalAmt)) > balance)
        {
            System.out.println("You cannot withdraw more than your current balance of " + balance + ".");
        }
        else
        {
            balance = balance - (Double.parseDouble(withdrawalAmt));
        }
        System.out.println("Your new balance is " + balance + ".");
        
		

	}
	
}
