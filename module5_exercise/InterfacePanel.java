import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class InterfacePanel extends JPanel implements ActionListener {
    private JTextField txtTempToConvert;
    private JRadioButton radFromFahrenheit;
    private JRadioButton radFromCelsius;
    private JButton btnConvert;
    private JLabel lblFahrenheitText;
    private JLabel lblCelciusText;
    private JLabel lblKelvinText;
    private JLabel lblFahrenheitTemperature;
    private JLabel lblCelsiusTemperature;
    private JLabel lblKelvinTemperature;
    private JLabel lblWelcomeMessage;
    private double dblFTemp;
    private double dblCTemp;
    private double dblKTemp;
    private double dblTempToConvert;


    // Constructor, create a new elements
    public InterfacePanel() {
        lblWelcomeMessage = new JLabel("Welcome to the Temperature Converter");
        txtTempToConvert = new  JTextField(10);
        // txtTempToConvert.addActionListener(new RadioButtonListener());
        radFromCelsius = new JRadioButton("Convert FROM Celsius");
        // radFromCelsius.addActionListener(new RadioButtonListener());
        radFromCelsius.setSelected(true);
        radFromFahrenheit = new JRadioButton("Convert FROM Fahrenheit");
        // radFromFahrenheit.addActionListener(new RadioButtonListener());
        btnConvert = new JButton("Convert!");
        btnConvert.addActionListener(this);
        lblFahrenheitText = new JLabel("Fahrenheit Degrees: ");
        lblCelciusText = new JLabel("Celsius Degrees: ");
        lblKelvinText = new JLabel("Kelvin Degrees: ");
        lblFahrenheitTemperature = new JLabel();
        lblCelsiusTemperature = new JLabel();
        lblKelvinTemperature = new JLabel();

 
        // Add elements to the JPanel
        add (lblWelcomeMessage);
        add (txtTempToConvert);
        add (radFromCelsius);
        add (radFromFahrenheit);
        add (lblFahrenheitText);
        add (lblFahrenheitTemperature);
        add (lblCelciusText);
        add (lblCelsiusTemperature);
        add (lblKelvinText);
        add (lblKelvinTemperature);
        add (btnConvert);

        // Group the Radio Buttons
        ButtonGroup grpConversionChoices = new ButtonGroup();
        grpConversionChoices.add(radFromCelsius);
        grpConversionChoices.add(radFromFahrenheit);
    
    }

    // private class TextFieldlistener  implements ActionListener {

    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         dblTempToConvert = Double.parseDouble(txtTempToConvert.getText());
    //     }
        
    // }

    // private class RadioButtonListener implements ActionListener {

    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         dblTempToConvert = Double.parseDouble(txtTempToConvert.getText());

    //         if (radFromFahrenheit.isSelected()) {
    //             dblFTemp = dblTempToConvert;
    //             dblCTemp = fToC(dblFTemp);
    //             dblKTemp = cToK(dblCTemp);
    //         } else {
    //             dblCTemp = dblTempToConvert;
    //             dblFTemp = cToF(dblCTemp);
    //             dblKTemp = cToK(dblCTemp);    
    //         }
    //     }
    // }

    // private class ButtonListener implements ActionListener {

    //     @Override
    //     public void actionPerformed(ActionEvent e) {
    //         dblTempToConvert = Double.parseDouble(txtTempToConvert.getText());

    //         if (radFromFahrenheit.isSelected()) {
    //             dblFTemp = dblTempToConvert;
    //             dblCTemp = fToC(dblFTemp);
    //             dblKTemp = cToK(dblCTemp);
    //         } else {
    //             dblCTemp = dblTempToConvert;
    //             dblFTemp = cToF(dblCTemp);
    //             dblKTemp = cToK(dblCTemp);    
    //         }

    //         lblCelciusText.setText("Celsius: " + dblCTemp);
    //         lblFahrenheitText.setText("Fahrenheit: " + dblFTemp);
    //         lblKelvinText.setText("Kelvin: " + dblKTemp);    
    //     }
    // }

    @Override
    public void actionPerformed(ActionEvent e) {
        dblTempToConvert = Double.parseDouble(txtTempToConvert.getText());

        if (radFromFahrenheit.isSelected()) {
            dblFTemp = dblTempToConvert;
            dblCTemp = fToC(dblFTemp);
            dblKTemp = cToK(dblCTemp);
        } else {
            dblCTemp = dblTempToConvert;
            dblFTemp = cToF(dblCTemp);
            dblKTemp = cToK(dblCTemp);    
        }

        lblCelciusText.setText("Celsius: " + dblCTemp);
        lblFahrenheitText.setText("Fahrenheit: " + dblFTemp);
        lblKelvinText.setText("Kelvin: " + dblKTemp);   
    }

    private double fToC(double dblFTemp) {
        return ((dblFTemp - 32.0) * (5.0 / 9.0));
    }

    private double cToF(double dblCTemp) {
        return ((dblCTemp * (9.0 / 5.0)) + 32.0);
    }

    private double cToK(double dblCTemp) {
        return (dblCTemp +  273.00);
    }
}
