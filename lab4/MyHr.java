// Title: Lab4
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 13/10/2026
/*Brief: You have been asked to create a rudimentary HR system called MyHr to help
administer the growing number of employees in the company. The system will
manage the employees’ details and office number allocation.
The system should offer the user the following options:
1. List all offices
2. Create a new employee record
3. List all employees*/
/* Notes: Driver class for Employee, Address and Office classes 
          AI was used for the generation of employee records of Names and Addresses */

import lab4.Employee;
import lab4.Address;
import lab4.Office;

public class MyHr {
    public static void listEmployees(Employee myEmployees[]) {  //Method to return all employee details
        String employeeDetails;

        for (int index = 0; index < myEmployees.length; index++) {
            employeeDetails = "Employee ID: " + myEmployees[index].getMyEmpID() + ", First Name: " + myEmployees[index].getFirstname() + ", Last Name: " + myEmployees[index].getLastName() + ", Employee Type: " + myEmployees[index].getEmpType() + ", Address: " + myEmployees[index].getEmpAddress().toString() + ", Office Number: " + myEmployees[index].getAssignedOff().getThisOfficeNumber();
           
            if (myEmployees[index].getEmpType().equals("Manager")) {  //If the employee is a manager, add the car type to the string
            employeeDetails += ", Car Type: " + myEmployees[index].getCarType();
            System.out.println(employeeDetails);
            }

            else {
                System.out.println(employeeDetails);
            }
        }
    }

    public static void listOffices(Office myOffices[]) {
        for (int index = 0; index < myOffices.length; index++) {
            System.out.println("Office Number: " + myOffices[index].getThisOfficeNumber());
        }
    }

    public static void main(String[]args){
        
        Employee[] employees = new Employee[5]; //Create an array of employees with a maximum of 5 employees
        Office[] offices = new Office[3]; //Create an array of offices with a maximum of 3 offices
        //Create 3 office objects
        Office office100 = new Office();
        Office office101 = new Office();
        Office office102 = new Office();
        offices[0] = office100;
        offices[1] = office101;
        offices[2] = office102;


        //Create 5 employee objects (3 staff and 2 managers)
        Address address1 = new Address("123 Main St", "Dublin", "Dublin");
        employees[0] = new Employee("John", "Doe", "Staff",address1, office100);
        office100.addEmployee(employees[0]);

        Address address2 = new Address("456 Elm St", "Cork", "Cork");
        employees[1] = new Employee("Jane", "Smith", "Staff", address2, office101);
        office101.addEmployee(employees[1]);

        Address address3 = new Address("789 Oak St", "Galway", "Galway");
        employees[2] = new Employee("Mike", "Johnson", "Staff", address3, office102);
        office102.addEmployee(employees[2]);

        Address address4 = new Address("321 Pine St", "Limerick", "Limerick");
        employees[3] = new Employee("Sarah", "Williams", "Manager", address4, office101, "Ford Focus");
        office101.addEmployee(employees[3]);

        Address address5 = new Address("654 Cedar St", "Waterford", "Waterford");
        employees[4] = new Employee("David", "Brown", "Manager", address5, office102, "Toyota Corolla");
        office102.addEmployee(employees[4]);

        listOffices(offices);
        listEmployees(employees);
    }
}
