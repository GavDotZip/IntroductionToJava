// Define a package named A2
package A2;

// Define a class named RandomPersonTester
public class RandomPersonTester {

    // Main method, entry point of the program
    public static void main(String[] args){

        // Create an array to store RandomPerson objects
        RandomPerson[] personList = new RandomPerson[3];

        // Inform user about creating people
        System.out.println("Creating Array");

        // Loop through the personList array
        for(int i=0; i < personList.length; i++){
            // Create a new RandomPerson object
            RandomPerson newPerson = new RandomPerson();
            // Assign the newly created RandomPerson object to the array
            personList[i] = newPerson;
        }

        // Inform user about printing the contents of the array
        System.out.println("Printing Array");

        // Loop through the personList array using enhanced for loop
        for (RandomPerson randomPerson : personList) {
            // Print the string representation of each RandomPerson object
            System.out.println(randomPerson.toString());
        }

        // Inform user about modifying the contents of the array
        System.out.println("Altering Array");

        // Loop through the personList array using enhanced for loop
        for (RandomPerson randomPerson : personList) {
            // Modify the attributes of each RandomPerson object
            randomPerson.setName("Phoenix Wright");
            randomPerson.setAge(30);
            randomPerson.setGender('M');
        }

        // Inform user about printing the contents of the modified array
        System.out.println("Printing New Array");

        // Loop through the personList array using enhanced for loop
        for (RandomPerson randomPerson : personList) {
            // Print the string representation of each modified RandomPerson object
            System.out.println(randomPerson.toString());
        }
    }
}
