package A2;

import java.util.Scanner;

public class ConvertTemperature {

    // Method to round a value to two decimal places
    static double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    // Method to convert Celsius to Fahrenheit
    static double convertCelsiusToFahrenheit(float celsius){
        // Convert Celsius to Fahrenheit using the formula: (Celsius * 9/5) + 32
        double fahrenheit = 9.0/5.0 * celsius + 32;
        // Round the result to two decimal places
        return roundToTwoDecimalPlaces(fahrenheit);
    }

    // Method to convert Fahrenheit to Celsius
    static double convertFahrenheitToCelsius(float fahrenheit){
        // Convert Fahrenheit to Celsius using the formula: (Fahrenheit - 32) * 5/9
        double celsius = 5.0/9.0*(fahrenheit - 32);
        // Round the result to two decimal places
        return roundToTwoDecimalPlaces(celsius);
    }

    public static void main (String[] args) {

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        // Loop until the user chooses to exit
        while(isRunning){

            // Display menu options
            System.out.println("1. - Celsius to Fahrenheit \n2. - Fahrenheit to Celsius \n3. - Exit");
            System.out.println("Select an Option");

            // Read user input
            switch(scanner.nextLine()) {
                case "1":
                    System.out.println("Enter Celsius value:");
                    // Read Celsius value from the user
                    float celsiusValue = Float.parseFloat(scanner.nextLine());
                    // Convert Celsius to Fahrenheit and display the result
                    System.out.println(celsiusValue + " Celsius = " + convertCelsiusToFahrenheit(celsiusValue) + " Fahrenheit");
                    break;
                case "2":
                    System.out.println("Enter Fahrenheit value:");
                    // Read Fahrenheit value from the user
                    float fahrenheitValue = Float.parseFloat(scanner.nextLine());
                    // Convert Fahrenheit to Celsius and display the result
                    System.out.println(fahrenheitValue + " Fahrenheit = "+ convertFahrenheitToCelsius(fahrenheitValue) + " Celsius");
                    break;
                case "3":
                    // Exit the program
                    System.out.println("Exiting program...");
                    isRunning = false;
                    break;
                default:
                    // Display message for invalid input
                    System.out.println("Invalid!");
                    break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
