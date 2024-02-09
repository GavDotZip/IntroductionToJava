package A3;

// Import the Scanner class from the java.util package
import java.util.Scanner;

// Define the class MonthlyRain
public class MonthlyRain {

    // The main method, entry point of the program
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an array to store monthly rainfall data
        float[] monthlyRain = new float[12];
        // Variable to store the total rainfall
        float totalRainfall = 0;

        // Loop through each month to get rainfall data
        for (int i = 0; i < monthlyRain.length; i++) {
            // Prompt the user to input rainfall for each month
            System.out.println("Please input rainfall in centimeters for month " + (i + 1) + ":");
            // Read the user input and store it as a float value
            float thisMonthRain = Float.parseFloat(scanner.nextLine());
            // Store the rainfall data for this month in the array
            monthlyRain[i] = thisMonthRain;
        }

        // Calculate the total rainfall by summing up all the monthly rainfall
        for (float v : monthlyRain) {
            totalRainfall = totalRainfall + v;
        }

        // Calculate the average annual rainfall
        float avgRainfall = totalRainfall / monthlyRain.length;

        // Display the average annual rainfall to the user
        System.out.println("The average annual rainfall is " + avgRainfall + " centimeters.");

        // Close the scanner to release system resources
        scanner.close();

    }

}
