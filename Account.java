import java.util.Random;

//************************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, and get a String representation
// of the account.
//************************************************************

public class Account
{
	private double balance;
	private String name;
	private long acctNum;
	private static int numAcounts = 0;     //declare a private static integer variable to hold this value, it will be initialized to int 0
	private static Random rnd =new Random ();

	//-------------------------------------------------
	//Constructor -- uses default balance, owner, and generates a random account number
	//-------------------------------------------------
	public Account()
	{
		balance = 0;
		name = "unknown";
		acctNum = rnd.nextInt(99999 - 10000 + 1) + 10000; // int max 99999 and int min 10000 acctNum =rnd.nextInt(max-min +1) + min;
		int numAccounts = 0;
		numAccounts++;     // add coden to constructor to increment this variable
	}

	//-------------------------------------------------
	//Constructor -- initializes the owner as specified; sets the initial balance to 0 and randomly generates the account number
	//-------------------------------------------------
	public Account(String owner)
	{
		balance = 0;
		name = owner;
		acctNum = rnd.nextInt(99999 - 10000 + 1) + 10000;
		int numAccounts = 0;
		numAccounts++; // add coden to constructor to increment this variable
	}

	//-------------------------------------------------
	//Constructor -- initializes the balance and owner as specified; randomly generates the account number.
	//-------------------------------------------------
	public Account(double initBal, String owner)
	{
		balance = initBal;
		name = owner;
		acctNum = rnd.nextInt(99999 - 10000 + 1) + 10000;
		int numAccounts = 0;
		numAccounts++;          // add coden to constructor to increment this variable
	}

	//-------------------------------------------------
	//Constructor -- initializes balance, owner, and account number
	//-------------------------------------------------
	public Account(double initBal, String owner, long number)
	{
		balance = initBal;
		name = owner;
		acctNum = number;
	}

	//-------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	//-------------------------------------------------
	public void withdraw(double amount)
	{
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}

	//-------------------------------------------------
	// Checks to see if balance is sufficient for withdrawal plus a fee
	// If so, decrements balance by amount plus the fee; if not, prints message.
	//-------------------------------------------------
	public void withdraw(double amount, double fee)
	{
		if (balance >= amount + fee)
			balance -= amount + fee;
		else
			System.out.println("Insufficient funds");
	}


	//-------------------------------------------------
	// Adds deposit amount to balance.
	//-------------------------------------------------
	public void deposit(double amount)
	{
		balance += amount;
	}

	//-------------------------------------------------
	// Returns balance.
	//-------------------------------------------------
	public double getBalance()
	{
		return balance;
	}

	//-------------------------------------------------
	// Returns a string containing the name, account number, and balance.
	//-------------------------------------------------
	public String toString()
	{
		return "Name:" + name +
				"\nAccount Number: " + acctNum +
				"\nBalance: " + balance;
	}

	//-------------------------------------------------
	// Returns the number of open accounts
	//-------------------------------------------------
	public static int getNumAccounts ()
	{
		int numAccounts = 0;
		return numAccounts;
	}

	public void close()
	{

		//This method should close the current account by appending “CLOSED” to the account name and setting the balance to 0. 
		//(The account number should remain unchanged.) Also decrement the total number of accounts.
		name = name + "-CLOSED";
		balance =0;
		int numAccount = 0;
		numAccount --;
	}

	public static  Account consolidate(Account acct1, Account acct2) 

	{
		Account acct3 = null;
		if (acct1.name == acct2.name && acct1.acctNum != acct2.acctNum)
		{
			acct3 = new Account(acct1.name);
			acct3.balance = acct1.balance + acct2.balance;
			acct1.close();
			acct2.close();
		}

		{
			System.out.println("Error. Unable to consolidate the accounts.");
		}

		return acct3;
	}

	public void transfer(Account acct, double amount)
	{
		if(this.balance >= amount )
		{
			this.balance -= amount;
			acct.balance += amount;
		}

		else
		{
			System.out.println("Error. Insufficient funds. ");
		}

		

	}


}


