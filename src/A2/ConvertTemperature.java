package A2;

import java.util.Scanner;

public class ConvertTemperature {

    static double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    static double convertCelsiusToFahrenheit(float celsius){
        double fahrenheit = 9.0/5.0 * celsius + 32;
        return roundToTwoDecimalPlaces(fahrenheit);
    }

    static double convertFahrenheitToCelsius(float fahrenheit){
        double celsius = 5.0/9.0*(fahrenheit - 32);
        return roundToTwoDecimalPlaces(celsius);
    }

    public static void main (String[] args) {

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        while(isRunning){

            System.out.println("1. - Celsius to Fahrenheit \n2. - Fahrenheit to Celsius \n3. - Exit");
            System.out.println("Please select a function to continue");

            switch(scanner.nextLine()) {
                case "1":
                    System.out.println("Enter Celsius value:");
                    float celsiusValue = Float.parseFloat(scanner.nextLine());
                    System.out.println(celsiusValue + " Celsius = " + convertCelsiusToFahrenheit(celsiusValue) + " Fahrenheit");
                    break;
                case "2":
                    System.out.println("Enter Fahrenheit value:");
                    float fahrenheitValue = Float.parseFloat(scanner.nextLine());
                    System.out.println(fahrenheitValue + " Fahrenheit = "+ convertFahrenheitToCelsius(fahrenheitValue) + " Celsius");
                    break;
                case "3":
                    System.out.println("Exiting program...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
        }

        scanner.close();
    }
}
