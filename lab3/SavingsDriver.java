// Title: Lab3aq2
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 08/10/2026
/* Brief: Driver program: Write a driver program to test class SavingsAccount. Instantiate
two different savingsAccount objects, saver1 and saver2, with balances of
€2000.00 and €3000.00, respectively. Set annualInterestRate to 4%, then
calculate the monthly interest and print the new balances for each of the savers.
Then set the annualInterestRate to 5% and calculate the next month's
interest and print the new balances for each of the savers. */

import lab3.SavingsAccount;

public class SavingsDriver {
    public static void main(String[]args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);

        SavingsAccount.modifyInterestRate(4);
        System.out.println("Annual Interest Rate: " + 4 + "%");
        System.out.println("Saver 1: " + saver1.getSavingsBalance());
        System.out.println("Saver 2: " + saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(5);
        System.out.println("Annual Interest Rate: " + 5 + "%");
        System.out.println("Saver 1: " + saver1.getSavingsBalance());
        System.out.println("Saver 2: " + saver2.getSavingsBalance());
    }
    
}
