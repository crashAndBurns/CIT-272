/*
 * Name: CLICalculator.java
 * Author: Frank E. Ciszek
 * Date: 1/25/2025
 * Purpose: Build the beginnings of a CLI Calculator using Java. We will
 * work with input and output, basic data types, string operations,
 * conditionals, and loops. For this milestone we will create the main
 * input loop for the CLI Calculator.
 */

import java.util.Scanner;

public class CLICalculator {
    public static void main(String[] args) {
        // Create the scanner object
        Scanner stdin = new Scanner(System.in);
        
        // Prompt the user for a mathematical expression
        String expression;
        printPrompt();
        
        // Get the expression from the user and convert to lower case string
        expression = stdin.nextLine().toLowerCase();
        
        // Control flow, if the expression == quit then prints an exit message
        // else enters into the while loop which calculates the number of tokens
        // in the expression (separated by spaces).  Note we don't handle the 
        // splitting of the string until we get into the while loop because 
        // there is no need to do any work if the user enters quit on the first
        // run.
        if (expression.equals("quit")) {
            printExitMsg();
        } else {
            while(!expression.equals("quit")) {
                // split the expression String by spaces
                String[] tokens = splitString(expression);
                System.out.println("Number of tokens and operators = " + tokens.length);

                // Get more user input
                printPrompt();
                expression = stdin.nextLine().toLowerCase();
            }
            stdin.close();
            printExitMsg();
        } 
    }
    
    /*
     * printPrompt function takes no input and prints the prompt for 
     * the user to enter a mathematical expression separated by spaces.
     * Gives an example and also informs the user of the sentinel value.
     */
    public static void printPrompt() {
        System.out.println("Enter a mathematical expression separated by spaces");
        System.out.print("such as '5 + 3' and I will evaluate it. Enter 'quit' to quit: ");
    }

    /*
     * splitString function takes one string as a parameter. It separates
     * the strings by space and then returns an array of strings equal
     * to the tokens in the expression.
     */
    public static String[] splitString(String stringToSplit) {
        return (stringToSplit.split(" "));
    }

    /*
     * printExitMsg function takes no parameters and prints a message
     * upon exiting the program. 
     */
    public static void printExitMsg() {
        System.out.println("Thanks for using the CLI Calculator!");
    }
}
