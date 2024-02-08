package A1;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        // Welcome message and prompt for the number of students
        System.out.println("Welcome! Personalized Student Class Tester initialized...");
        System.out.println("How many students would you like to add?");

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        System.out.println("Creating a list with " + numberOfStudents + " spaces...");

        // Array to store student objects
        Student[] studentList = new Student[numberOfStudents];

        for(int i = 0; i < studentList.length; i++){

            // Request and store student name and ID
            System.out.println("Please enter the name of Student " + (i+1));
            String name = scanner.nextLine() + " - ";
            System.out.println("Please enter the Student ID of Student " + (i+1));
            long idNumber = Long.parseLong(scanner.nextLine());

            // Create a new student object with the provided details
            Student student = new Student(name, idNumber);

            // Store the student in the studentList at the current index
            studentList[i] = student;
            System.out.println("Student added!");
        }

        System.out.println("\nStudent list includes: \n");

        // Display the list of students
        for (A1.Student student : studentList) {
            System.out.println(student);
        }

        scanner.close();

    }
}
