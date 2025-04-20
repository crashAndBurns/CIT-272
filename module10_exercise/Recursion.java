// Title: Recursion  
// Author: Frank E. Ciszek
// Date: 4/18/2025
// Purpose: Write a recursive function that takes an integer as
// an argument, will add all numbers from 1 to n
// and return an integer.  In the main function test the 
// recursive function and print the result. Also wrote a while
// loop to test the recursive function.

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        // integers to try:
        // 1 = 1
        // 2 = 2 + 1 = 3
        // 3 = 3 + 2 + 1 = 6
        // 4 = 4 + 3 + 2 + 1 = 10
        // 5 = 5 + 4 + 3 + 2 + 1 = 15
        // 100 = 5050;

        // Create the scanner and get the integer n
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter an integer greater or equal to 1 and I will find the sum of all numbers between 1 and that number: ");
        int n = stdin.nextInt();
        int result = recursiveAdd(n);
        
        // Print results of recursion
        System.out.println("Result from Recursion: " + result);

        // Begin check sequence
        int resultCheck = 0;
        
        // While n > 1 add n to result check, then decrement n by 1.
        while (n >= 1) {
            resultCheck += n;
            n--;
        }

        // Print resutls of while loop.
        System.out.println("Result from While Loop: " + resultCheck);

        // If resultcheck == result test passed, else test fails.
        if (resultCheck == result) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed.");
        }

        stdin.close();

    }
    
    // A recursive function used to add all numbers from 1 to n.
    // Counts down from n until n == 1. Returns 1 if n == 1.
    public static int recursiveAdd(int n) {
        if (n == 1) {
            return (1);
        } else {
            return (n + recursiveAdd(n - 1));
        }
    }
}