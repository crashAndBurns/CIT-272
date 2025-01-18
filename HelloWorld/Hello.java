/*
 * Name: Hello World
 * Author: Frank E. Ciszek
 * Date: 1/17/2025
 * Purpose: Hello.java is the classic "Hello, World" program.
 * Also used to take some notes for class.
 */

import java.util.Scanner;

public class Hello {
    
    /**
     * Describe the nature and purpose of the function here
     * @param args
     * Describe what that paramater means and what it is used for 
     */
    public static void main(String[] args) {
        System.out.print("Hello, ");  // allows you to chain parameters together.
                                        // Useful for input prompts.
        System.out.println("World!");  // adds a newline at the end of parameter.
        // System.out.println("Today is January " + 17); // printing numbers and strings together
    
    // Creating Variables:
    // Declare the variable and data type it is
    // That variable can only hold that specific type of data
    int x;  // Declare
    x = 5;  // Initialize
    System.out.println(x);  // Print

    int y = 42; // Declare and initialize in one step
    // double pi = 3.14;   // Double vs. float:
    //                     // difference is the size of the number used to
                        // represent them.

    // Java types:
    // byte (8 bit, -128 to 127), short (16 bit -32768 to 32767), 
    // int (32 bit), long (64 bit)
    // byte num = 86;

    // Float has two levels of precision
    // Float = 32 bit precision = 7 decimal point precision
    // Double = 64 bit precision = 16 decimal point precision

    // boolean isDone = false; 
    // char myGrade = 'B'; // use single quotes to denote a single character
    // String word = "foo";    // use double quotes to denote a string
                            // String is capitalized because it's an object
                            // Strings are so common that they get treated
                            // like a primative data type.  They are really
                            // an array of characters.

    // Getting input:
    // create a scanner object
    Scanner scnr = new Scanner(System.in);  // new creates a new instance of an object.
    // declare a variable
    String name;
    System.out.print("Enter your name: ");
    name = scnr.nextLine(); // gets a whole line of input from the buffer.
    System.out.println("Hello, " + name + "!");

    // Getting numbers
    System.out.print("Enter your age: ");
    x = scnr.nextInt();
    scnr.nextLine();    // Is kind of like flushing the input buffer
    System.out.print("How many credit hours are you taking? ");
    y = scnr.nextInt();
    System.out.println(y);
    // double result = Math.sqrt(y);
    // double xCubed = Math.pow(x,3);
    }
}