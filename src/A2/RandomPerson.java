package A2;

// Define a class named RandomPerson
public class RandomPerson {

    // Private attributes of the RandomPerson class
    private int age;       // Stores the age of the person
    private String name;   // Stores the name of the person
    private char gender;   // Stores the gender of the person

    // Default constructor initializes attributes to default values
    public RandomPerson(){
        this.age = 0;               // Default age set to 0
        this.name = "Unknown";      // Default name set to "Unknown"
        this.gender = '?';          // Default gender set to '?'
    }

    // Parameterized constructor initializes attributes with given values
    public RandomPerson(String personName, int personAge, char personGender){
        this.name = personName;     // Set name to provided personName
        this.age = personAge;       // Set age to provided personAge
        this.gender = personGender; // Set gender to provided personGender
    }

    // Getter method for retrieving age
    public int getAge(){
        return this.age;  // Return the value of age
    }

    // Getter method for retrieving gender
    public char getGender() {
        return this.gender;  // Return the value of gender
    }

    // Getter method for retrieving name
    public String getName() {
        return this.name;  // Return the value of name
    }

    // Setter method for updating age
    public void setAge(int personAge) {
        this.age = personAge;  // Update the value of age
    }

    // Setter method for updating gender
    public void setGender(char personGender){
        this.gender = personGender;  // Update the value of gender
    }

    // Setter method for updating name
    public void setName(String personName){
        this.name = personName;  // Update the value of name
    }

    // Override toString method to provide custom string representation of the object
    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getGender();  // Return string representation of the object
    }
}
