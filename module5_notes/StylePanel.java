import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class StylePanel extends JPanel implements ItemListener {
    private JLabel saying;
    private JCheckBox italic;
    private JCheckBox bold;

    public StylePanel() {
        saying = new JLabel("Life is long, if you know how to use it.");
        italic = new JCheckBox("Italic");
        bold = new JCheckBox("Bold");

        saying.setFont(new Font("Arial", Font.PLAIN, 24));

        add(saying);
        add(italic);
        add(bold);

        italic.addItemListener(this);
        bold.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       int style = Font.PLAIN;
       
       if (italic.isSelected()) {
            style += Font.ITALIC;
       } 
       
       if (bold.isSelected()) {
            style += Font.BOLD;
       }

       saying.setFont(new Font("Arial", style, 24));
    }
}
