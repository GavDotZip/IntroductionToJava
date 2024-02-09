package A2;

public class RandomPersonTester {

    public static void main(String[] args){

        RandomPerson[] personList = new RandomPerson[2];

        System.out.println("Creating people...");

        for(int i=0; i < personList.length; i++){
            RandomPerson newPerson = new RandomPerson();
            personList[i] = newPerson;
        }

        System.out.println("Printing contents of array...");

        for (RandomPerson randomPerson : personList) {
            System.out.println(randomPerson.toString());
        }

        System.out.println("Modifying contents of array...");

        for (RandomPerson randomPerson : personList) {
            randomPerson.setName("Edgar Allen Pug");
            randomPerson.setAge(5);
            randomPerson.setGender('M');
        }

        System.out.println("Printing contents of modified array...");

        for (RandomPerson randomPerson : personList) {
            System.out.println(randomPerson.toString());
        }



    }
}
