package Observer;

import Data.WetterData;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class WetterChangeFrame extends JFrame implements Observer {
    private final JTextField tempText;

    private final JTextField humidityText;

    private final JTextField air_pressureText;

    private final JTextField tempTextValue;

    private final JTextField humidityTextValue;

    private final JTextField air_pressureTextValue;



    public WetterChangeFrame(){
        this.tempText = new JTextField();
        this.tempText.setText("Temp:  ");
        this.tempText.setEnabled(true);

        this.humidityText = new JTextField();
        this.humidityText.setText("Humidity:  ");
        this.humidityText.setEnabled(true);

        this.air_pressureText = new JTextField();
        this.air_pressureText.setText("Air Pressure:  ");
        this.air_pressureText.setEnabled(true);

        this.tempTextValue = new JTextField();

        this.humidityTextValue = new JTextField();

        this.air_pressureTextValue = new JTextField();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 50);
        setLayout(new GridLayout(3,2));

        add(tempText, 1,1);
        add(humidityText, 2, 1);
        add(air_pressureText, 3,  1);

        add(tempTextValue, 1,2);
        add(humidityTextValue, 2, 2);
        add(air_pressureTextValue, 3,  2);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.humidityTextValue.setText((String) arg);
        this.humidityTextValue.setText();
        this.humidityTextValue.setText();
    }
}
