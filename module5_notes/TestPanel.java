import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// Create a custom JPanel object that will contain our
// GUI components
public class TestPanel extends JPanel { // Typically we use inheritance to add compnetns 
                         // TO the parent JPanel object. Use extends
                         // to make a subclass.  
    // JPanel is a container  used to hold different components that
    // you want to display. YOu can't see it unless you give it a
    // different background color.

    // Attributes are the GUI components inside the JPanel
    // (BUttons, Labels, Checkboxes, Tabs, etc.)
    private JLabel message; // used to display read only text
    private JButton button; // A button that can be clicked.
    private JTextField name;
    
    // Non GUI attributes as well such as counters etc.
    private boolean clicked;

    // Constructor
    // Create a new JLabel instance.
    // But doesn't add it to the JPanel
    public TestPanel() {
        clicked = false;
        message = new JLabel("Hello, World!");
        button = new JButton("Click to say Hello!");
        name = new JTextField(20);
        

        // add our components to the jpanel
        // TestPanel IS a Jpanel since we inherited from it
        // This means we have inherited jpanel methods including
        // the "add()" method.
        add(message); // adds the message to the jpanel
        add(button); // adds the button to the jpanel.
        add(name);

        // customize fonts and colors using setters
        setBackground(Color.PINK);
        button.setBackground(Color.WHITE);
        message.setFont(new Font("Arial", Font.PLAIN,18));
        button.setFont(new Font("Arial", Font.PLAIN, 18));

        // Done using a Listener, there are differenttypes of Listeners
        // associated with different types of components.
        // (Listeners are objects)
        ButtonListener listener = new  ButtonListener();
        //    This is better to do when you have multiple buttons
        //    responding to the same listener.
        // button.addActionListener(new ButtonListener());
        button.addActionListener(listener);
        name.addActionListener(listener); // Responds to pressing enter
    }

    // Interaction methods and inner classes
    // (Actually the code that responds to UI events like clicks)
    // Method 1 - Crete a private inner class that implements the
    //  ActionListener interface.  When you create a class that implements
    //  an interface  you must create a function that matches the 
    //  method signature in the interface class
    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // The code that is executed when you click the Button
            // calling the function happens automatically when the 
            // button is clicked.

            if (e.getSource() == button) {
                 // Set the text of the message jlabel.
                if (clicked) {
                    clicked = false;
                    message.setText("Hello, World!");
                    button.setText("Click to say Hello!");
                } else {
                    clicked = true;
                    // String text = name.getText();
                    // message.setText("Hello, " + text);
                    message.setText("Hello, " + name.getText());
                    button.setText("Unclick this button");
                }
            } else if (e.getSource() == name) {
                message.setText("Hello, " + name.getText());
            }
        }
    } 
}
