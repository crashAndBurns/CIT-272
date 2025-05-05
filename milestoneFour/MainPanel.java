/*
 * Main panel class for the GUI calculator
 * Author: Frank E. Ciszek
 * Date: 3/5/2025
 * Purpose: This class establishes the layout of the calculator
 * and the behavior of the buttons based on various action listeners
 * 
 * 5/4/2025
 * Updated the calculator main panel to evaluate the expression string
 * when the = button is clicked. This was done for the final milestone
 * of the project.
 * 
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel {
    // Attributes
    private String expression;
    private String results;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b0;
    private JButton bDecimal;
    private JButton bEquals;
    private JButton bAddition;
    private JButton bSubtraction;
    private JButton bMultiplication;
    private JButton bDivision;
    private JButton bExponential;
    private JButton bClear;
    private JButton bDummy0;
    private JButton bDummy1;
    private JLabel expressionLabel;
    private JLabel resultsLabel;
    private Calculator calculator;

    // default constructor
    public MainPanel() {
        this.expression = "";
        this.results = "";
        setLayout(new BorderLayout());
        // Create a new north panel and add it to the  Main Panel
        JPanel northPanel = new JPanel();
        add(northPanel, BorderLayout.NORTH);
        northPanel.setLayout(new BorderLayout());
        // set preferred size of north panel, hopefully this will solve the issue
        // of items not showing up.
        northPanel.setPreferredSize(new Dimension(1700, 50));

        // Create two border layout panels in the north Panel,
        // a north and a south panel. These will contain the 
        // expression and results labels.
        JPanel northNorthPanel = new JPanel();
        JPanel northSouthPanel = new JPanel();
        northPanel.add(northNorthPanel, BorderLayout.NORTH);
        northPanel.add(northSouthPanel, BorderLayout.SOUTH);
        northNorthPanel.setBackground(Color.GRAY);
        // Set preferred size of the north panel within north panel
        // hopefully this will solve the issue of items not showing up.
        northNorthPanel.setPreferredSize(new Dimension(1700, 25));
        northSouthPanel.setBackground(Color.WHITE);
        // set preferred size of south panel within north panel. Hope that this
        // will solve the issue wih buttons items not showing up.
        northSouthPanel.setPreferredSize(new Dimension(1700, 25));


        // Create the expression and results labels
        // then  add them to the appropriate nested panels.
        expressionLabel = new JLabel(expression);
        resultsLabel = new JLabel(results);
        northNorthPanel.add(expressionLabel, BorderLayout.NORTH);
        northSouthPanel.add(resultsLabel, BorderLayout.SOUTH);

        //  Establishes theg rid layout for the buttons.  I included
        // two dummy buttons in order to make the layout look a littl nicer
        // The dummy buttons do not have any action listener attached to them.
        JPanel centerPanel = new JPanel();
        add(centerPanel, BorderLayout.CENTER);        
        JPanel centerButtonPanel = new JPanel();
        centerButtonPanel.setLayout(new GridLayout(4,5));
        centerPanel.add(centerButtonPanel);
        
        // Add the number and operation buttons
        // Declare an action listener as a variable so that I
        // can reuse the listener for each button. Declaring a new
        // action listener for each button is illogical becasue it
        // uses too much memory.
        ActionListener numberListener = new NumberButtonHandler();
        bAddition = new JButton("+");
        centerButtonPanel.add(bAddition);
        bAddition.addActionListener(numberListener);
        // Sets  preferred size of addition button and changes size of all 
        // buttons in the grid layout. I tried manually setting the preferred size
        // of the buttons after receiving feedback from professor doolin that
        // not all buttons were showing. Hopefully this combined with the
        // large preferred size of the jframe in guicalculator.java will solve the issue.
        bAddition.setPreferredSize(new Dimension(50, 25));
        bSubtraction = new JButton("-");
        centerButtonPanel.add(bSubtraction);
        bSubtraction.addActionListener(numberListener);
        bMultiplication = new JButton("*");
        centerButtonPanel.add(bMultiplication);
        bMultiplication.addActionListener(numberListener);
        bDivision = new JButton("/");
        centerButtonPanel.add(bDivision);
        bDivision.addActionListener(numberListener);
        bExponential = new JButton("^");
        centerButtonPanel.add(bExponential);
        bExponential.addActionListener(numberListener);
        b1 = new JButton("1");
        centerButtonPanel.add(b1);
        b1.addActionListener(numberListener);
        b2 = new JButton("2");
        centerButtonPanel.add(b2);
        b2.addActionListener(numberListener);
        b3 = new JButton("3");
        centerButtonPanel.add(b3);
        b3.addActionListener(numberListener);
        b4 = new JButton("4");
        centerButtonPanel.add(b4);
        b4.addActionListener(numberListener);
        b5 = new JButton("5");
        centerButtonPanel.add(b5);
        b5.addActionListener(numberListener);
        b6 = new JButton("6");
        centerButtonPanel.add(b6);
        b6.addActionListener(numberListener);
        b7 = new JButton("7");
        centerButtonPanel.add(b7);
        b7.addActionListener(numberListener);
        b8 = new JButton("8");
        centerButtonPanel.add(b8);
        b8.addActionListener(numberListener);
        b9 = new JButton("9");
        centerButtonPanel.add(b9);
        b9.addActionListener(numberListener);
        b0 = new JButton("0");
        centerButtonPanel.add(b0);
        b0.addActionListener(numberListener);
        bDummy0 = new JButton("");
        centerButtonPanel.add(bDummy0);
        bDecimal = new JButton(".");
        centerButtonPanel.add(bDecimal);
        // Treats the decimal button as a number
        bDecimal.addActionListener(numberListener);
        bClear = new JButton ("AC");
        centerButtonPanel.add(bClear);
        // Add the extra buttons such as clear and =
        bClear.addActionListener(new ACButtonHandler());
        bEquals = new JButton ("=");
        centerButtonPanel.add(bEquals); 
        bEquals.addActionListener((new EqualButtonHandler()));
        bEquals.setBackground(Color.ORANGE);
        bDummy1 = new JButton("");
        centerButtonPanel.add(bDummy1);
        
        // Instantiate a new calculator object in the constructor
        calculator = new Calculator();
        
    }

    // Getters and Setters
    public String GetExpression() {
        return expression;
    }

    // Action Listeners
    // Number/Operator button handler, takes empty accumulator string (result) and 
    // builds the expression that will be used in the expressiontext label.
    // Sets the expressionLabel text to the accumulated expression when a number or operator
    // button is clicked by the user.
    public class NumberButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String result = "";
            JButton source = (JButton) e.getSource();
            result = numberButtonHandler(source);
            expression += result;
            // System.out.println(expression);
            expressionLabel.setText((expression));         
        }
    }

    // Equal button handler, sets result equal to expression and sets the 
    // result label text to the results/expression when the equal button is
    // clicked by the user.
    public class EqualButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            results = expression;

            String[] tokens = expression.split(" ");
            if (calculator.isValidExpression(tokens)) {
                String result = String.valueOf(calculator.evaluate(tokens));
                resultsLabel.setText(result);
            } else {
                resultsLabel.setText("INVALID");
            }
            // System.out.println(results);
            // resultsLabel.setText(results);
        }
    }

    // Clear buttn handler/listener, sets the expression to the empty string 
    // and sets the text of the resultsLabel to the empty string when the 
    // clear button is pressed.
    public class ACButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            expression = "";
            results = "";
            // System.out.println(expression);
            expressionLabel.setText(expression);
            resultsLabel.setText(results);
        }

    }

    // Methods
    // numberButtonHandler method, takes a JButton as a parameter (buttonPressed) and
    // first determines if it is an operator button (+, -, *, /, ^) etc.  Returns the
    // text operator surrounded by spaces if the button pressed is an operator and returns
    // the text of the button pressed if it is just a number button.
    private String numberButtonHandler(JButton buttonPressed) {
        if (isOperator(buttonPressed)) {
            return (" " + buttonPressed.getText() + " ");
        } else {
            return (buttonPressed.getText());
        }
    }

    // Is operator method, takes a JButton as a parameter (buttonPressed)
    // and returns true if the button pressed is an operator (such as  +, -, *, /)
    // etc. Returns false if not. Will be used in the NumberButtonHandler.
    private boolean isOperator (JButton buttonPressed) {
        boolean result = false;
        if (buttonPressed == bAddition || buttonPressed == bSubtraction ||
            buttonPressed == bMultiplication || buttonPressed == bDivision ||
            buttonPressed == bExponential) {
                result = true;
            }
        return result;
    }
}