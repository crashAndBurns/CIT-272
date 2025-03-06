import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;

    public MainPanel() {
        setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        // Add two JPanels
        add(northPanel, BorderLayout.NORTH);
        // set a layout for north panel
        northPanel.setLayout(new BoxLayout(northPanel, BoxLayout.X_AXIS));
        add(centerPanel, BorderLayout.CENTER);
        centerPanel.setLayout(new FlowLayout());
        
        JPanel centerContentPanel = new JPanel();
        centerContentPanel.setLayout(new BoxLayout(centerContentPanel, BoxLayout.Y_AXIS));
        centerPanel.add(centerContentPanel);

        // Add Content
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        b6 = new JButton("Button 6");

        northPanel.add(b1);
        northPanel.add(b2);
        centerContentPanel.add(b3);
        centerContentPanel.add(b4);
        centerContentPanel.add(b5);
        centerContentPanel.add(b6);

        // Change Colors
        northPanel.setBackground(Color.CYAN);
        centerPanel.setBackground(Color.WHITE);
    }
    // Create Various Action Listeners
    private class SomeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
        
    }

}