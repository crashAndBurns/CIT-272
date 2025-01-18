##########################################################################
# Name: time_dilation.py
# Author: Frank E. Ciszek
# Date: 1/18/2025
# Purpose: A python exercise to calculate the effects of  time dilation
# on a space traveler. Speed of light is 3.0e8 m/s and the time 
# dilation formula is :
# t(Observer) = t(traveler) / (sqrt(1 - ((v / c) ** 2)))
# where t(Observer) is the time that passes for the observer while
# t(traveler) is the time that passes for the space traveler.
##########################################################################

from math import sqrt

def main():
    # define the constants
    c = 3.0e8 # measured in meters per second
    
    print("This program calcualtes Time Dilation for a space traveler")

    # Get inputs and define variables
    name_of_traveler = input("Please enter the name of the space traveler: ")
    name_of_observer = input("Please enter the name of the observer on Earth: ")
    velocity_of_traveler = float(input("Please enter the traveler's velocity as a percentage of the speed of light.\neg (0.0 for 0 percent and 1.0 for 100 percent): "))
    t_traveler = float(input("Enter the time that passes for the traveler as a decimal value: "))
    unit_of_measure = input("Will time be measures in seconds, minutes, hours, days, or years? ")

    # Multiply to get the actual speed traveled from the percentage entered
    actual_velocity = float(velocity_of_traveler * c)

    # Perform the time dilation calculation
    t_observer = t_traveler / (sqrt(1 - ((actual_velocity / c) ** 2 )))

    # print the results
    print(f"If {name_of_traveler} travels at {velocity_of_traveler * 100}% the speed of light,\
          {t_traveler} {unit_of_measure} passes for {name_of_traveler}, while\
          {t_observer} {unit_of_measure} passes for {name_of_observer}.\n")


if __name__ == "__main__":
    main()