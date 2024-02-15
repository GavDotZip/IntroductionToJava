package A4;

public class Contact {

    // Private fields for name and number
    private String name;
    private long number;

    // Constructor to initialize name and number
    public Contact(String name, long number){
        this.name = name;
        this.number = number;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for number
    public long getNumber() {
        return number;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for number
    public void setNumber(long number) {
        this.number = number;
    }

    // Override toString method to return contact details
    @Override
    public String toString() {
        return this.name + " " + this.number;
    }
}
