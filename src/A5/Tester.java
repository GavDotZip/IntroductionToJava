// Define a package named A5
package A5;

// Define an abstract class named MySalesEmployee
abstract class MySalesEmployee {

    // Define private instance variables
    private String firstName;
    private String lastName;
    private static int employeeCounter = 0;
    private String employeeID;
    protected double sales;
    protected double commission;
    private int employeeNumber;

    // Default constructor initializes instance variables with default values
    MySalesEmployee() {
        this.firstName = "U";
        this.lastName = "U";
        this.employeeID = "U";
        this.employeeNumber = ++MySalesEmployee.employeeCounter;
    }

    // Parameterized constructor initializes instance variables with provided values
    MySalesEmployee(String firstName, String lastName, String employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.employeeNumber = ++MySalesEmployee.employeeCounter;
    }

    // Setter methods to set values for first name, last name, and employee ID
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    // Getter methods to retrieve values of first name, last name, and employee ID
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    // Override toString method to return a string representation of the object
    @Override
    public String toString() {
        return " First Name: " + firstName + " Last Name: " + lastName + " Employee ID: " + employeeID + " Employee Number: " + employeeNumber + " Sales: " + sales + " Commission: " + commission;
    }

    // Abstract method for calculating commission
    abstract public void calculateCommission();

}

// Define a subclass named MySalesAgent which extends MySalesEmployee
class MySalesAgent extends MySalesEmployee {

    // Default constructor sets default values for first name, last name, and employee ID
    MySalesAgent() {
        this.setFirstName("NA");
        this.setLastName("NA");
        this.setEmployeeID("NA");
    }

    // Parameterized constructor sets values for first name, last name, and employee ID
    MySalesAgent(String firstName, String lastName, String employeeID) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmployeeID(employeeID);
    }

    // Override calculateCommission method to calculate commission for sales agent
    public void calculateCommission() {
        this.commission = this.sales * 0.10;
    }

}

// Define another subclass named MySalesPerson which extends MySalesEmployee
class MySalesPerson extends MySalesEmployee {

    // Default constructor sets default values for first name, last name, and employee ID
    MySalesPerson() {
        this.setFirstName("?");
        this.setLastName("?");
        this.setEmployeeID("?");
    }

    // Parameterized constructor sets values for first name, last name, and employee ID
    MySalesPerson(String firstName, String lastName, String employeeID) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmployeeID(employeeID);
    }

    // Override calculateCommission method to calculate commission for sales person
    public void calculateCommission() {
        this.commission = this.sales * 0.15;
    }

}
