// Title: Lab3aq2
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 08/10/2026
/* Brief: Create a class SavingsAccount. Each SavingsAccount should have a unique
number that is automatically assigned by the constructor method, i.e. the number is
not to be passed as a parameter to the constructor. The account numbers should
start at 1 and count upwards in increments of 1.
Use a static class variable to store the annualInterestRate for each of the
savers. Each object of the class contains a private instance variable
savingsBalance indicating the amount the saver currently has on deposit.
Provide method calculateMonthlyInterest() to calculate the monthly
interest by multiplying the balance by annualInterestRate divided by 12; this
interest should be added to savingsBalance. Provide a static method
modifyInterestRate() that sets the annualInterestRate to a new value. */


public class SavingsAccount {

    static int latestId = 1;
    private int myId;
    private int savingsBalance;
    private static int annualInterestRate = 2;
    
    public SavingsAccount()
    {
        myId = latestId++;
        savingsBalance = 0;
    }

    public SavingsAccount(int savingsBalance)   //Overloaded constructor for inserting a savingsBalance value when creating a new object
    {
        myId = latestId++;
        this.savingsBalance = savingsBalance;
    }

    public int calculateMonthlyInterest()
    {
        int monthlyInterest = (savingsBalance * annualInterestRate) / 12;

        return monthlyInterest;
    }

    public static void modifyInterestRate(int newRate)
    {
        annualInterestRate = newRate;
    }


    // setter and getter methods for class attributes
    public int getLatestId() {   
        return latestId;
    }

    public int getMyId() {
        return myId;
    }

    public int getSavingsBalance() {
        return savingsBalance;
    }

    public int getAnnualInterestRate() {
        return annualInterestRate;
    }

}
