package javafa;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class game implements ActionListener {
    JFrame f1 = new JFrame("game");
    JPanel p = new JPanel();
    JLabel l1 = new JLabel("choix");
    JLabel l2 = new JLabel("resultat");
    JLabel l3 = new JLabel("random");
    JTextField t1 = new JTextField(8);
    JTextField t2 = new JTextField(8);

    JButton b10 = new JButton("0");
    JButton b11 = new JButton("1");
    JButton b12 = new JButton("2");
    JButton b13 = new JButton("3");
    JButton b14 = new JButton("4");
    JButton b15 = new JButton("5");
    JButton b16 = new JButton("6");
    JButton b17 = new JButton("7");
    JButton b18 = new JButton("8");
    JButton b19 = new JButton("9");
    JButton b = new JButton("resultat");
    JButton b1 = new JButton("clear");
    JButton b2 = new JButton("exit");
    JButton b3 = new JButton("give a number");

    String ch = "";
    String ch2;

    public game() {
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);

        f1.setSize(500, 600);
        f1.setDefaultCloseOperation(f1.EXIT_ON_CLOSE);
        p.setSize(800, 750);
        p.add(l3);

        p.add(b3);
        p.add(l1);

        p.add(t1);

        p.add(b1);

        p.add(b10);

        p.add(b11);

        p.add(b12);

        p.add(b13);

        p.add(b14);

        p.add(b15);

        p.add(b16);

        p.add(b17);

        p.add(b18);

        p.add(b19);

        p.add(l2);

        p.add(t2);

        p.add(b);

        p.add(b2);

        f1.add(p, BorderLayout.CENTER);

        f1.pack();
        f1.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b10) {
            ch = ch + "0";
            t1.setText(ch);
        } else if (e.getSource() == b11) {
            ch = ch + "1";
            t1.setText(ch);
        } else if (e.getSource() == b3) {
            int max = 100;
            int min = 1;
            Random num = new Random();
            int x = min + num.nextInt(max);

            ch2 = Integer.toString(x);

        } else if (e.getSource() == b12) {
            ch = ch + "2";
            t1.setText(ch);
        } else if (e.getSource() == b13) {
            ch = ch + "3";
            t1.setText(ch);
        } else if (e.getSource() == b14) {
            ch = ch + "4";
            t1.setText(ch);
        } else if (e.getSource() == b15) {
            ch = ch + "5";
            t1.setText(ch);
        } else if (e.getSource() == b16) {
            ch = ch + "6";
            t1.setText(ch);
        } else if (e.getSource() == b17) {
            ch = ch + "7";
            t1.setText(ch);
        } else if (e.getSource() == b18) {
            ch = ch + "8";
            t1.setText(ch);
        } else if (e.getSource() == b19) {
            ch = ch + "9";
            t1.setText(ch);
        } else if (e.getSource() == b) {
            int i = Integer.parseInt(ch2);
            if (Integer.parseInt(t1.getText()) == i) {
                JOptionPane.showMessageDialog(f1, "goood game you win !!!!");
                t2.setText("bravo");
            } else {
                JOptionPane.showMessageDialog(f1, "the nomber was " + i + " sad,try again !");
                t2.setText("failed");
            }

        }

        else if (e.getSource() == b1) {

            t1.setText("");
            t2.setText("");
            ch = "";
            JOptionPane.showMessageDialog(f1, "done!!");
        }

        else if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(f1, "bye bye");
            System.exit(0);

        }
    }

    public static void main(String[] args) {
        new game();
    }

}
