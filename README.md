# Design-and-Interfaces

    Changing People

The file ChangingPeople.java contains a program that illustrates parameter passing. The program uses Person objects defined in the file Person.java. Do the following:

    Trace the execution of the program using diagrams similar to those in Figure 7.5 of the text (which is a trace of the program in Listings 7.15–7.17). Also show what is printed by the program.
    Compile and run the program to see if your trace was correct.
    Modify the changePeople method so that it does what the documentation says it does, that is, the two Person objects passed in as actual parameters are actually changed.
    
        Using the Comparable Interface

    Write a class Compare3 that provides a static method largest. Method largest should take three Comparable parameters and return the largest of the three (so its return type will also be Comparable). Recall that method compareTo is part of the Comparable interface, so largest can use the compareTo method of its parameters to compare them.

    Write a class Comparisons whose main method tests your largest method above.

    First prompt the user for and read in three strings, use your largest method to find the largest of the three strings, and print it out. (It’s easiest to put the call to largest directly in the call to println.) Note that since largest is a static method, you will call it through its class name, e.g., Compare3.largest(val1, val2, val3).

    Add code to also prompt the user for three integers and try to use your largest method to find the largest of the three integers. Does this work? If it does, it’s thanks to autoboxing, which is Java 1.5’s automatic conversion of ints to Integers. You may have to use the -source 1.5 compiler option for this to work.
    
       A Flexible Account Class

File Account.java contains a definition for a simple bank account class with methods to withdraw, deposit, get the balance and account number, and return a String representation. Note that the constructor for this class creates a random account number. Save this class to your directory and study it to see how it works. Then modify it as follows:

    Overload the constructor as follows:

    public Account (double initBal, String owner, long number) - initializes the balance, owner, and account number as specified
    public Account (double initBal, String owner) - initializes the balance and owner as specified; randomly generates the account number.
    public Account (String owner) - initializes the owner as specified; sets the initial balance to 0 and randomly generates the account number.

    Overload the withdraw method with one that also takes a fee and deducts that fee from the account.

File TestAccount.java contains a simple program that exercises these methods. Save it to your directory, study it to see what it does, and use it to test your modified Account class.

//************************************************************

// Account.java

//

// A bank account class with methods to deposit to, withdraw from,

// change the name on, and get a String representation

// of the account.

    Opening and Closing Accounts

File Account.java (see previous exercise) contains a definition for a simple bank account class with methods to withdraw, deposit, get the balance and account number, and return a String representation. Note that the constructor for this class creates a random account number. Save this class to your directory and study it to see how it works. Then write the following additional code:

    Suppose the bank wants to keep track of how many accounts exist.

    Declare a private static integer variable numAccounts to hold this value. Like all instance and static variables, it will be initialized (to 0, since it’s an int) automatically.
    Add code to the constructor to increment this variable every time an account is created.
    Add a static method getNumAccounts that returns the total number of accounts. Think about why this method should be static - its information is not related to any particular account.
    File TestAccounts1.java contains a simple program that creates the specified number of bank accounts then uses the getNumAccounts method to find how many accounts were created. Save it to your directory, then use it to test your modified Account class.

    Add a method void close() to your Account class. This method should close the current account by appending “CLOSED” to the account name and setting the balance to 0. (The account number should remain unchanged.) Also decrement the total number of accounts.

    Add a static method Account consolidate(Account acct1, Account acct2) to your Account class that creates a new account whose balance is the sum of the balances in acct1 and acct2 and closes acct1 and acct2. The new account should be returned. Two important rules of consolidation:

    Only accounts with the same name can be consolidated. The new account gets the name on the old accounts but a new account number.
    Two accounts with the same number cannot be consolidated. Otherwise this would be an easy way to double your money!

Check these conditions before creating the new account. If either condition fails, do not create the new account or close the old ones; print a useful message and return null.

    Write a test program that prompts for and reads in three names and creates an account with an initial balance of $ 100 for each. Print the three accounts, then close the first account and try to consolidate the second and third into a new account.

Now print the accounts again, including the consolidated one if it was created.

    Transfering Funds

File Account.java (see A Flexible Account Class exercise) contains a definition for a simple bank account class with methods to withdraw, deposit, get the balance and account number, and print a summary. Save it to your directory and study it to see how it works. Then write the following additional code:

    Add a method public void transfer(Account acct, double amount) to the Account class that allows the user to transfer funds from one bank account to another. If acct1 and acct2 are Account objects, then the call acct1.transfer(acct2,957.80) should transfer $957.80 from acct1 to acct2. Be sure to clearly document which way the transfer goes!

    Write a class TransferTest with a main method that creates two bank account objects and enters a loop that does the following:

    Asks if the user would like to transfer from account1 to account2, transfer from account2 to account1, or quit.
    If a transfer is chosen, asks the amount of the transfer, carries out the operation, and prints the new balance for each account.
    Repeats until the user asks to quit, then prints a summary for each account.

    Add a static method to the Account class that lets the user transfer money between two accounts without going through either account. You can (and should) call the method transfer just like the other one - you are overloading this method.

Your new method should take two Account objects and an amount and transfer the amount from the first account to the second account. The signature will look like this:

public static void transfer(Account acct1, Account acct2, double amount)

Modify your TransferTest class to use the static transfer instead of the instance version.

