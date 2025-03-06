import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Test Application");
        // Causes program to exit when the window's close button is clicked
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add our components / JPanels
        // Get JFrame's ContentPane object and call its add()
        // method to add our custom JPanel to the window.
        window.getContentPane().add(new MainPanel());

        window.setPreferredSize(new Dimension(400, 200));
        window.pack();
        window.setVisible(true);
    }
}
