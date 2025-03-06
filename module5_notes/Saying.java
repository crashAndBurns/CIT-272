import java.awt.Dimension;

import javax.swing.JFrame;

public class Saying {
   public static void main(String[] args) {
    JFrame window = new JFrame("Say it with Style");
        
        // Note that the program keeps running after we close the
        // JFrame so we have to have the program exit on clicking the close button
        // This sets the default close behavior.
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Lets add some content
        // TestPanel tPanel = new TestPanel();
        
        // Get JFrame's content pane object and
        // call its add() method to add our custom JPanel
        // To the window.
        window.getContentPane().add(new QuotePanel());

        // Dimension windowSize = new Dimension(400, 200);
        window.setPreferredSize(new Dimension(600, 150));
        window.pack();  // Causes window to be sized to fit preferred 
                        // Components and subcombonents in the window
        window.setVisible(true); // Sets the window to visible
        
   } 
}
