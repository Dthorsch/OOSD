// Title: Lab3aq3
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 08/10/2026
/* Brief: A driver class to test the BankCustomer and SavingsAccount classes */

import lab3.BankCustomer;
import lab3.SavingsAccount;

public class BankDriver {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Dylan Thorsch", "69 My Street");

        customer.addAccount(new SavingsAccount(1000));
        customer.addAccount(new SavingsAccount(3000));
        customer.addAccount(new SavingsAccount(4000));  //Adding three accounts to the customer
        customer.printSummary();    //calling the printSummary method to print the details of the customer

        customer.addAccount(new SavingsAccount(1000)); // Trying to add a fourth account, should print a error message
    }
}
