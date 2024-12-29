import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Main {
    static JLabel text = new JLabel("Hello. This Guide will determine wether you are allowed to paticipate in the election or not.");

    public static void main(String[] args) {

        openUI();

    }

    public static void tester(Integer alter){



        if (alter >= 16)
        {
            text.setText("Welcome " +". " + "You can participate in the election");
        } else
        {
            text.setText("Sorry you are not allowed to participate.");
        }
    }

    public static void openUI() {
        JFrame frame = new JFrame("Altersfreigabe Tester");
        frame.setSize(4000, 500);
        frame.setLocation(100,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);


        text.setBounds(450, 50, 2000, 30);

        JTextField textFieldfeld = new JTextField();
        textFieldfeld.setBounds(580, 150, 300, 50);

        JButton button = new JButton("Enter");
        button.setBounds(630,250,200,40);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFromTextField = textFieldfeld.getText();
                Integer number = Integer.parseInt(textFromTextField);
                tester(number);
            }
        });

        frame.add(textFieldfeld);
        frame.add(button);
        frame.add(text);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}