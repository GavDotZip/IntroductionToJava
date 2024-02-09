package A2;

public class RandomPerson {

    private int age;
    private String name;
    private char gender;

    public RandomPerson(){
        this.age = 0;
        this.name = "Unknown";
        this.gender = '?';
    }

    public RandomPerson(String personName, int personAge, char personGender){
        this.name = personName;
        this.age = personAge;
        this.gender = personGender;
    }

    public int getAge(){
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int personAge) {
        this.age = personAge;
    }

    public void setGender(char personGender){
        this.gender = personGender;
    }

    public void setName(String personName){
        this.name = personName;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() + " " + getGender();
    }
}
