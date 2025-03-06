/*
 * Program Name: GUI Calculator
 * Author: Frank E Ciszek
 * Date: 3/5/2025
 * Purpose: Milestone two, create a GUI version of a
 * calculator for class. The calculator will be step two towards
 * the final project. It will accumulate an expression string based
 * on the buttons clicked by the user. Number buttons will be added to
 * the expression while operatos will be added to the accumulator
 * surrounded by two spaces. When the clear button is clicked, the expression
 * will reset to the empty string and when the = button is clicked 
 * the results label will be set to the expression string. We'll 
 * perform the actuall calculations in a later project.
 */

import java.awt.Dimension;
import javax.swing.JFrame;

public class GUICalculator {
    public static void main(String[] args) {
        // Instantiate a new JFrame called window
        JFrame window = new JFrame("GUI Calculator");
        // Set the default close operation of window to close the program
        // on clicking the close button.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components to the JFrame
        window.getContentPane().add(new MainPanel());

        // Set preferred dimensions of the calculator window
        window.setPreferredSize(new Dimension(300, 250));
        window.pack();
        // Prevent the JFrame from being resized by the user
        window.setResizable(false);
        // Make the window visible
        window.setVisible(true);
    }
}