// Title: Lab4
// Name: Dylan Thorsch
// Student ID: C00216112
// Date: 13/10/2026
/*Brief: The user can create up to a maximum of 5 employee records.
- Each employee should have an automatically assigned employee number,
starting at employee number 1000
- They should have an address consisting of
o Street
o City/town
o County
- They should have an employee type of either “Staff” or “Manager”
- If they are a “Manager” then they should have some details about their
company car
- They must be assigned to an existing Office (maximum 2 people in an office)*/
import lab4.Address;
import lab4.Office;

public class Employee {
    private String firstname;
    private String lastName;
    private static int empID = 999; //Default office number will be incremented by 1 for each new employee (first employeed will be be assigned to number 1000 after the increment);
    private static int noOfEmp = 0; //Number of employess, 0 by default
    private Office assignedOff;  //Office assigned to employee
    private String empType;   //Using private so that the subclasses (Staff and Manager) can access this variable, String variable that returns the employee type (Staff or Manager)
    private int myEmpID; //Variable to store individual employee object ID numbers
    private Address empAddress; //Variable to store employee address object
    private String carType; //Variable to store the car type for managers

    public Employee(String firstname, String lastName, String empType, Address empAddress, Office assignedOff) {
        empID++;
        setMyEmpID(empID); //Set the employee ID for this instance
        setEmptype(empType); //Set the employee type to staff for this constructor
        noOfEmp++;
        setFirstname(firstname);
        setLastName(lastName);
        setEmpAddress(empAddress);
        setAssignedOff(assignedOff);
    }

    public Employee(String firstname, String lastName, String empType, Address empAddress, Office assignedOff, String carType) {    //Overloaded constructor for adding managers, takes in the car type as an additional parameter
        empID++;
        setEmptype(empType); //Set the employee type to manager for this constructor
        setMyEmpID(empID);
        noOfEmp++;
        setFirstname(firstname);
        setLastName(lastName);
        setEmpAddress(empAddress);
        setAssignedOff(assignedOff);
        setCarType(carType);
    }

    public void listAllEmployees(Employee[] employees) {  //Method to return all employee details
        String employeeDetails;

        for (int index = 0; index < noOfEmp; index++) {
            employeeDetails = "Employee ID: " + employees[index].getMyEmpID() + ", First Name: " + employees[index].getFirstname() + ", Last Name: " + employees[index].getLastName() + ", Employee Type: " + employees[index].getEmpType() + ", Address: " + employees[index].getEmpAddress().toString() + ", Office Number: " + employees[index].getAssignedOff().getThisOfficeNumber();
            if (employees[index].getEmpType().equals("Manager")) {  //If the employee is a manager, add the car type to the string
            employeeDetails += ", Car Type: " + carType;
            System.out.println(employeeDetails);
            }
        }
    }

    public void employeeDetails() {  //Method to return the details of a single employee
        String employeeDetails = "Employee ID: " + getMyEmpID() + ", First Name: " + getFirstname() + ", Last Name: " + getLastName() + ", Employee Type: " + getEmpType() + ", Address: " + getEmpAddress().toString() + ", Office Number: " + getAssignedOff().getThisOfficeNumber();
        if (getEmpType().equals("Manager")) {  //If the employee is a manager, add the car type to the string
            employeeDetails += ", Car Type: " + carType;
        }
        System.out.println(employeeDetails);
    }

    //Setters for employee first name, last name, address and office number
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    } 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpAddress(Address empAddress) {
        this.empAddress = empAddress;
    }

    public void setAssignedOff(Office assignedOff) {
        this.assignedOff = assignedOff;
    }

    public void setEmptype(String empType) {

        if(empType!="Staff" && empType!="Manager") {  //If the employee type is not staff or manager, set it to staff by default
            System.out.println("Invalid employee type. Setting to Staff by default.");
            this.empType = "Staff";
        } 

        else {
            this.empType = empType;
        }
    }

    public void setMyEmpID(int empID) {
        this.myEmpID = empID;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }


    //Getters for employee first name, last name, address and office number, number of employees, ID and employee type
    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getEmpAddress() {
        return empAddress;
    }

    public Office getAssignedOff() {
        return assignedOff;
    }

    public static int getNoOfEmp() {
        return noOfEmp;
    }

    public int getMyEmpID() {
        return myEmpID;
    }
    public String getEmpType() {    
        return empType;
    }

    public String getCarType() {
        return carType;
    }

    public String getOfficeNum(Office assignedOff) {  //Get the office number for the employees office
        return assignedOff.getThisOfficeNumber();
    }
    








}
