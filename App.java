import javafa.game;
import javafa.LengthConvert;
import javafa.WeightConvert;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class App implements ActionListener {
    JFrame f = new JFrame("unity convert");
    JPanel panel = new JPanel();
    JButton B = new JButton("Length Converter");
    JButton B1 = new JButton("Weight Converter");
    JButton B2 = new JButton("Let s play a game");
    JLabel L1 = new JLabel("Welcome !!!", JLabel.CENTER);

    public App() {
        B.addActionListener(this);
        B1.addActionListener(this);
        B2.addActionListener(this);

        f.setSize(600, 600);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        panel.setSize(600, 600);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints A = new GridBagConstraints();
        A.ipadx = 150;
        A.gridx = 1;
        A.gridy = 0;
        A.insets = new Insets(9, 9, 9, 9);
        panel.add(L1, A);
        A.gridx = 1;
        A.gridy = 1;
        panel.add(B, A);
        A.gridx = 1;
        A.gridy = 2;
        panel.add(B1, A);
        A.gridx = 1;
        A.gridy = 3;
        panel.add(B2, A);
        f.add(panel, BorderLayout.CENTER);
        f.pack();
        f.setTitle("converter");
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B2) {
            f.setVisible(false);
            new game();

        } else if (e.getSource() == B) {
            f.setVisible(false);
            new LengthConvert();
        } else if (e.getSource() == B1) {
            f.setVisible(false);
            new WeightConvert();
        }
    }

    public static void main(String[] args) {
        new App();
    }

}
