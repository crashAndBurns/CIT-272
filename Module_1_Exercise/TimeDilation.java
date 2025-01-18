/*
 * Name: TimeDilation.java
 * Authror: Frank E. Ciszek
 * Date:  1/18/2025
 * Purpose: Calculates the effects of time dilation on a space traveler
 * for the class CIT-272 at WVNCC. Speed of light is 3.0e8 m/s
 * and the time dilation formula is:
 * tObserver = tTraveler / (sqrt(1 - ((v / c) ** 2)))
 * where c is the speed of light, tObserver is the time passed for the observer 
 * on Earth, and tTraveler is the time passed for the traveler in space.
 * 
 */

import java.util.Scanner;

public class TimeDilation {
    public static void main(String[] args) {
        // Create the scanner object to handle user input
        Scanner scnr = new Scanner(System.in);

        // create a constant for the speed of light
        final double c = 3.0e8; // meters/second

        System.out.println("This program calculates Time Dilation for a space traveler. ");

        // Get the name of the  space traveler
        System.out.print("Enter the name of the traveler: ");
        String nameTraveler = scnr.next();

        // Get name of the observer on Earth
        System.out.print("Enter the name of the observer on Earth: ");
        String nameObserver = scnr.next();

        // Get the velocity of the space traveler
        System.out.print("Enter the velocity of the traveler as a percentage of the speed of light: ");
        double velocityTraveler = scnr.nextDouble();

        // Get the amount of time that passes for the traveler
        System.out.print("Enter the time that passes for the traveler: ");
        double tTraveler = scnr.nextDouble();

        // Get the unit of time
        System.out.print("Will the time be measured in seconds, minutes, hours, days, or years? ");
        String unitOfTime = scnr.next();

        // Multiply traveler velocity by constant c to get velocity in meters per second
        double actualVelocity = velocityTraveler * c;

        // Calculate the time dilation
        double tObserver = tTraveler / Math.sqrt(1 - (Math.pow((actualVelocity / c), 2)));
        
        // Output the results
        System.out.printf("If %s travels a %f%% the speed of light, %f %s passes for %s while %f %s passes for %s.\n", 
                          nameTraveler, velocityTraveler * 100, tTraveler, unitOfTime,
                          nameTraveler, tObserver, unitOfTime, nameObserver);

        // Close the scanner Object. VSCode was giving a warning that the scnr object was 
        // not closed properly so I looked up how to close it.
        scnr.close();
    } // End of Main
 } // End of class TimeDilation

