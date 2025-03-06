/*
 * Name: TempConversion.java
 * Author: Frank E. Ciszek
 * Class: CIT-272
 * Date: 1/20/2025
 * Purpose: Create a temperature conversion prograom similar to the one
 * from CIT-232. We will practice writing functions, writing loops,
 * using conditional if statements, handling exceptions with try/catch
 * blocks, and converting strings to numeric data types.
 */

import java.util.Scanner;

public class TempConversionTryCatch {
    // Begin main function
    public static void main(String[] args) {
        // Create a new scanner
        Scanner stdin = new Scanner(System.in);

        // Create the do-while loop
        String tempInput = "";
        do {
            double tempDouble;

            // Get Fahrenheit temperature from user
            System.out.print("Please enter a Fahrenheit temperature to convert: ");
            // Get i nput and convert to lower case so that any iteration
            // of the word quit will quit.
            tempInput = stdin.nextLine().toLowerCase();
            // Try convert to double
            if (!tempInput.equals("quit")) {
                // The try and catch was bothersome at first but I got
                // It after looking at a few examples on w3Schools
                try {
                    tempDouble = Double.parseDouble(tempInput);
                    
                    // Check to make sure fahrenheit is above abs zero
                    // to print, else print error message.
                    if (fToK(tempDouble) >= 0.0) {
                        //Print results
                        // Could have created seperate variables for each case
                        // but decided not to.
                        printResults(tempDouble, fToC(tempDouble), fToK(tempDouble));
                    } else {
                        System.out.println("Invalid temperature. Cannot be below absolute zero.");
                    }

                    // // Check if Fahrenheit is less than absolute zero
                    // if (fToK(tempDouble) < 0.0) {
                    //     System.out.println("Invalid temperature. Cannot be below absolute zero.");
                    //     // Had to use continue here to skip an iteration
                    //     // of the loop (so it doesn't print on if 
                    //     // *F is less than abs zero). I suppose I could
                    //     // change the if statement to 
                    //     // if (fToK(tempDouble) >= 0.0) {
                    //     //     printResults() 
                    //     // }
                    //     continue;
                    // }
   
                // Print invalid temp exception
                // Got NumberFormatException from the error listed when
                // I tried to convert xzy to a double.
                } catch (Exception NumberFormatException) {
                    System.out.println("Invalid Fahrenheit temperature.");
                }
            }
        } while (!tempInput.equals("quit"));
        
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