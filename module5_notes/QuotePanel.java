import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class QuotePanel extends JPanel implements ActionListener {
    
    private String philosophyQuote;
    private String carpentryQuote;
    private String comedyQuote;
    private JLabel quote;
    private JRadioButton philosophyButton;
    private JRadioButton carpentryButton;
    private JRadioButton comedyButton;

    public QuotePanel() {
        philosophyQuote = "We love ourselves more than others, but care more about their opinion than our own.";
        carpentryQuote = "Measure twice, cut once.";
        comedyQuote = "Every book is a children's book, if the kid can read.";
        quote = new JLabel("Life is long if you know how to use it");
    
    philosophyButton = new JRadioButton("Philosophy");
    philosophyButton.setSelected(true);
    philosophyButton.addActionListener(this);
    carpentryButton = new JRadioButton("Carpentry");
    carpentryButton.addActionListener(this);
    comedyButton = new JRadioButton("Comedy");
    comedyButton.addActionListener(this);
    quote = new JLabel(philosophyQuote);

    add (quote);
    add (philosophyButton);
    add (carpentryButton);
    add (comedyButton);
    
    setPreferredSize(new Dimension(600, 150));

    // Group the radio buttons
    ButtonGroup group = new ButtonGroup();
    group.add(philosophyButton);
    group.add(carpentryButton);
    group.add(comedyButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (philosophyButton.isSelected()) {
            quote.setText(philosophyQuote);
        } else if (carpentryButton.isSelected()) {
            quote.setText(carpentryQuote);
        } else {
            quote.setText(comedyQuote);
        }
    }
}
