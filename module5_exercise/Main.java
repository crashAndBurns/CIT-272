import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Instantiate a new JFrame named window
        JFrame window = new JFrame("Temperature Converter");

        // Exit the program on closing the window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add a anew interface panel to the content pane.
        window.getContentPane().add(new InterfacePanel());

        // set preferred size
        window.setPreferredSize(new Dimension(400, 200));

        // size the window appropriately
        window.pack();

        // Make the window visible
        window.setVisible(true);
    }
}