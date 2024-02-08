package A1;

public class Student {

    // Define student attributes
    private String name;
    private long idNumber;

    // Default constructor sets default values
    public Student(){
        this.name = "John Smith";
        this.idNumber = 1234567890L;
    }

    // Constructor with parameters for name and ID
    public Student(String name, long idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    // Getter and setter methods for student attributes
    public String getName(){
        return name;
    }

    public long getIDNumber() {
        return idNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIDNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    // String representation of the student object
    public String toString() {
        return "Student Name: " + this.name + ", ID Number: " + this.idNumber;
    }

}
