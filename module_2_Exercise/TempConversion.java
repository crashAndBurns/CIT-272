/*
 * Name: TempConversion.java
 * Author: Frank E. Ciszek
 * Class: CIT-272
 * Date: 1/20/2025
 * Purpose: Create a temperature conversion prograom similar to the one
 * from CIT-232. We will practice writing functions, writing loops,
 * using conditional if statements.
 */

import java.util.Scanner;

public class TempConversion {
    // Begin main function
    public static void main(String[] args) {
        // Create a new scanner
        Scanner stdin = new Scanner(System.in);

        // Write a for loop that will repeat 5 times. Each iteration
        // Prompts the user to enter Fahrenheit temp as a decimal number
        // Gets the input from the user without worrying about data validation.
        // Prints the results using the prinresults function
        // Evaluates if the kelvin temperature is below zero and prints:
        // Invalid temperature. Cannot be  below absolute zero. if the 
        // temp entered is below abs zero.

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a Fahrenheit temperature as a decimal number and I will convert it to Celsius and Kelvin if possible: ");
            double tempToConvert = stdin.nextDouble();
            if (fToK(tempToConvert) < 0.0) {
                System.out.println("Invalid temperature. Cannot be below absolute zero.");
            } else {
                printResults(tempToConvert, fToC(tempToConvert), fToK(tempToConvert));
            }
        }

        //Close the stdin scanner
        stdin.close();
    } // End Main Function

    /*
     * fToC Function, takes a double temperature in Fahrenheit
     * and returns the temperature in celsius as a double.
     */
    public static double fToC(double temperature) {
        return ((temperature - 32.0) * (5.0 / 9.0));
    }

    /*
     * fToK Function, takes a double temperature in Celsius and
     * returns the temperature in degrees Kelvin as a double.
     */
    public static double fToK(double temperature) {
        return (fToC(temperature) + 273.15);
    }

    /*
     * printResults Function: Takes three doubles as parameters,
     * temperature in degrees Fahrenheit, temperature in degrees Celsius,
     * and temperature in Degrees Kelvin and prints them to the output 
     * string.
     */
    public static void printResults(double temperature,
    double tCelsius, double tKelvin) {
        System.out.println("Fahrenheit  " + temperature);
        System.out.println("Celsius " + tCelsius);
        System.out.println("Kelvin " + tKelvin);
    }


}