package BankingApplication;
import java.util.*;
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1 = new BankAccount("Rushi","MH20");
		obj1.showMenu();
	}

}

class BankAccount
{
	String CustomerId;
	String CustomerName;
	int balance;
	int previousTransaction;
	
	BankAccount(String cname, String cid)
	{
		CustomerName = cname;
		CustomerId = cid;
	}
	
	void deposit(int amount) 
	{
			balance = balance + amount;
			previousTransaction = amount;
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction < 0)
		{
			System.out.println("Withdrawn: "+ previousTransaction);
		}
		else if (previousTransaction > 0)
		{
			System.out.println("Deposited: "+ previousTransaction);
		}
		else
		{
			System.out.println("No Transaction occured");
		}
	}
	
	void showMenu()
	{
		char option;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Welcome to HDFC "+ CustomerName);
		System.out.println("Your Id is: "+ CustomerId +"\n");
		
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit Amount");
		System.out.println("c: Withdraw Amount");
		System.out.println("D: Check Previous Transction");
		System.out.println("E: Exit");
		
		do
		{
			System.out.println("Select Option");
			option = sc.next().charAt(0);
			
			switch(option)
			{
				case 'A':
					System.out.println("Your Balance is: "+ balance +"\n");
					
					break;
				case 'B':
					System.out.println("Enter the Amount to be Deposited "+"\n");
					int amount1 = sc.nextInt();
					deposit(amount1);
					break;
				case 'C':
					System.out.println("Enter the Amount to be Withdrawn "+"\n");
					int amount2 = sc.nextInt();
					withdraw(amount2);
					break;
				case 'D':
					System.out.println("Previous Transactions ");
					getPreviousTransaction();
					break;
					
				case 'E':
					System.out.println("-----------------"+"\n");
					break;
					
					default:
						System.out.println("Invalid Option!! Please enter again");
						
			}
		}while(option != 'E');
		System.out.println("ThankYou for using our services.!");
	}
}
