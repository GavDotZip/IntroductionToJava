package A5;

abstract class MySalesEmployee {

    private String firstName;
    private String lastName;
    private static int employeeCounter = 0;
    private String employeeID;
    protected double sales;
    protected double commission;
    private int employeeNumber;

    MySalesEmployee() {
        this.firstName = "UNKNOWN";
        this.lastName = "UNKNOWN";
        this.employeeID = "UNKNOWN";
        this.employeeNumber = ++MySalesEmployee.employeeCounter;
    }

    MySalesEmployee(String firstName, String lastName, String employeeID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.employeeNumber = ++MySalesEmployee.employeeCounter;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmployeeID() {
        return this.employeeID;
    }

    @Override
    public String toString() {
        return " First Name: " + firstName + " Last Name: " + lastName + " Employee ID: " + employeeID + " Employee Number: " + employeeNumber + " Sales: " + sales + " Commission: " + commission;
    }

    abstract public void calculateCommission();

}

class MySalesAgent extends MySalesEmployee {

    MySalesAgent() {
        this.setFirstName("UNDECLARED");
        this.setLastName("UNDECLARED");
        this.setEmployeeID("UNDECLARED");
    }

    MySalesAgent(String firstName, String lastName, String employeeID) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmployeeID(employeeID);
    }

    public void calculateCommission() {
        this.commission = this.sales * 0.10;
    }

}

class MySalesPerson extends MySalesEmployee {

    MySalesPerson() {
        this.setFirstName("UNDECLARED");
        this.setLastName("UNDECLARED");
        this.setEmployeeID("UNDECLARED");
    }

    MySalesPerson(String firstName, String lastName, String employeeID) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmployeeID(employeeID);
    }

    public void calculateCommission() {
        this.commission = this.sales * 0.15;
    }

}
