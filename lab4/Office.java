// Title: Lab4
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 13/10/2026
/*Brief:
*/

import lab4.Employee;

public class Office {
    private static int officeNumber = 99; //Static variable to keep track of the office number, starting at 100 (after incrementing)
    private int thisOfficeNumber; //Variable to store the office number for each office object
    private Employee[] officeEmployees;
    private final int MAXEMPLOYEES = 2; //Maximum number of employees in an office
    private int noOfEmployees = 0; //Number of employees in the office
    private static int noOfOffices = 0; //Static variable to keep track of the number of office objects created

    public Office() {
        officeEmployees = new Employee[MAXEMPLOYEES];    //Initialize an employees array with the maximum number of employees
        officeNumber++; //Increment the office number
        thisOfficeNumber = officeNumber; //Set the office number for this instance
        noOfOffices++; //Increment the number of office objects created
    }

    public void addEmployee(Employee employee) {
        if (noOfEmployees < MAXEMPLOYEES) {
            officeEmployees[noOfEmployees] = employee; //Add the employee to the array
            noOfEmployees++; //Increment the number of employees in the office
            System.out.println("The employee was added to the office.");
        } else {
            System.out.println("Office is full. Cant add another employee.");   //Error message if the office is full
        }
    }

    public int getNoOfEmployees() {  //return the number of employees in the office
        return noOfEmployees;
    }

    public int getThisOfficeNumber() {  //return the office number for this instance 
        return thisOfficeNumber;
    }

    public static int getNoOfOffices() {  //return the number of offices
        return noOfOffices;
    }



    public void listAllOffices(Office[] offices) {  //toString method to return the office number and the number of employees in the office as well as total number of offices
        String officeDetails;

        for (int i = 0; i < noOfOffices; i++) {
            officeDetails = "Office Number: " + offices[i].getThisOfficeNumber() + ", Number of Employees: " + offices[i].getNoOfEmployees() + ", Number of offices: " + noOfOffices;
            System.out.println(officeDetails);
        }
    }
}
