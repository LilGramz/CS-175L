import java.util.Scanner;
public class BankAccountTester {
// with a starting balance of 1000, withdraw 500, deposit 1500, 
//get the balance and print the balance using the methods available in the BankAccount class.
	public static void main(String[] args) 
	{
		//variables
		double startBal = 0;
		double withDrawAmount = 0;
		double depositAmount = 0;
		
	
		Scanner in = new Scanner(System.in);
			System.out.println("Please enter the starting balance: ");
			startBal = in.nextDouble();
			BankAccount MyBankAccount = new BankAccount(startBal);
			
			System.out.println("Please enter the withdraw amount: ");
			withDrawAmount = in.nextDouble();
			MyBankAccount.withdraw(withDrawAmount);
			
			System.out.println("Please enter the deposit amount: ");
			depositAmount = in.nextDouble();
			MyBankAccount.deposit(depositAmount);
			
			
			System.out.println("Your current balance is:" + MyBankAccount.getBalance());
			in.close();
	
		} 
	}

