// Title: Lab3aq3
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 08/10/2026
/* Brief: Create a class BankCustomer. Each BankCustomer has a name, address and can
have up to three SavingsAccounts. The BankCustomer constructor method
should only accept the name and address of the customer. Provide a method called
addAccount that accepts one SavingsAccount parameter – the BankCustomer
object should keep track of how many valid SavingsAccounts have been added so far.
Provide a method called balance that computes and returns the BankCustomers
total savings. Provide a method summary that prints each account number and
corresponding balance. */



public class BankCustomer {
    private String custName;
    private String custAddress;
    private SavingsAccount[] accounts;
    final private int MAXACCOUNTS = 3;  // Variable to store the max number of accounts a BankCustomer can have
    private int noOfAccounts;

    public BankCustomer(String name, String address) {  // Constructor method to initialize the BankCustomer object with name and address
        custName = name;
        custAddress = address;
        accounts = new SavingsAccount[MAXACCOUNTS];
        noOfAccounts = 0;
    }

    public void addAccount(SavingsAccount account) { // Method to add a SavingsAccount to the BankCustomer's accounts array
        if (noOfAccounts < MAXACCOUNTS) {
            accounts[noOfAccounts] = account;
            noOfAccounts++;
        } else {
            System.out.println("You cannot have more than " + MAXACCOUNTS + " accounts.");
            }
    }

    public void printSummary() {

        String details; // Variable to hold the details of each account in the loop
        System.out.println("Customer Name: " + custName);  // Print the customer name
        System.out.println("Customer Address: " + custAddress);  // Print the customer address
        for(int index = 0; index < noOfAccounts; index++)      // Loop through the accounts array and print the account number and balance for each account
        {
            details = "Account Number: " + accounts[index].getMyId() + ", Balance: " + accounts[index].getSavingsBalance();    //Set details to a string containing the account number and balance of the current account in the loop
            System.out.println(details);    // Print the details of each account
        } 

        System.out.println("Total Balance: " + balance());  // Print the total balance of all accounts combined

    }

    public double balance()
    {
        double totalBalance = 0.0;
        for (int index = 0; index < noOfAccounts; index++) {    // Loop through the accounts array and add the balance of each account to totalBalance
            totalBalance += accounts[index].getSavingsBalance();
        }
        return totalBalance;
    }
}
