package javafa;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LengthConvert implements ActionListener {
   JFrame f = new JFrame("Length Convert");
   JPanel p = new JPanel();
   JComboBox box1 = new JComboBox();
   JComboBox box2 = new JComboBox();
   JTextField t1 = new JTextField(5);
   JTextField t2 = new JTextField(5);

   JButton b = new JButton("CONVERT");
   JButton b1 = new JButton("CLEAR");
   JButton b2 = new JButton("EXIT    ");

   public LengthConvert() {
      b.addActionListener(this);
      b1.addActionListener(this);
      b2.addActionListener(this);
      f.setSize(600, 600);
      f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

      box1.addItem("Unity");
      box1.addItem("KM");
      box1.addItem("M");
      box1.addItem("CM");
      box2.addItem("Unity");
      box2.addItem("KM");
      box2.addItem("M");
      box2.addItem("CM");
      p.setSize(300, 300);
      p.setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.ipadx = 100;
      gbc.gridx = 0;
      gbc.gridy = 0;
      gbc.insets = new Insets(9, 9, 9, 9);
      p.add(box1, gbc);
      gbc.gridx = 2;
      gbc.gridy = 0;
      p.add(t1, gbc);
      gbc.gridx = 6;
      gbc.gridy = 0;

      p.add(b1, gbc);

      gbc.gridx = 0;
      gbc.gridy = 2;
      p.add(box2, gbc);
      gbc.gridx = 2;
      gbc.gridy = 2;
      p.add(t2, gbc);
      gbc.gridx = 6;
      gbc.gridy = 2;
      p.add(b2, gbc);
      gbc.ipadx = 433;
      gbc.weightx = 10.0;
      gbc.gridwidth = 8;
      gbc.gridx = 0;
      gbc.gridy = 1;
      p.add(b, gbc);

      f.add(p, BorderLayout.CENTER);

      f.pack();
      f.setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == b) {
         String m1 = (String) box1.getSelectedItem();
         String m2 = (String) box2.getSelectedItem();
         double c = Double.parseDouble(t1.getText());
         if (box1.getSelectedItem() == box2.getSelectedItem())
            JOptionPane.showMessageDialog(f, "choose ANOTHER unity please!!");
         else if ((m1.equals("KM")) && (m2.equals("M"))) {
            c = c * 1000;
            String ch = Double.toString(c);
            t2.setText(ch);
         } else if ((m1.equals("KM")) && (m2.equals("CM"))) {
            c = c * 100000;
            String ch = Double.toString(c);
            t2.setText(ch);
         } else if ((m1.equals("KM")) && (m2.equals("Unity"))) {
            JOptionPane.showMessageDialog(f, "choose unity please!!");
         } else if ((m1.equals("CM")) && (m2.equals("Unity"))) {
            JOptionPane.showMessageDialog(f, "choose unity please!!");
         } else if ((m1.equals("M")) && (m2.equals("Unity"))) {
            JOptionPane.showMessageDialog(f, "choose unity please!!");

         } else if ((m1.equals("M")) && (m2.equals("CM"))) {
            c = c * 100;
            String ch = Double.toString(c);
            t2.setText(ch);
         } else if ((m1.equals("M")) && (m2.equals("KM"))) {
            c = c / 1000;
            String ch = Double.toString(c);
            t2.setText(ch);
         } else if ((m1.equals("CM")) && (m2.equals("KM"))) {
            c = c / 100000;
            String ch = Double.toString(c);
            t2.setText(ch);
         } else if ((m1.equals("CM")) && (m2.equals("M"))) {
            c = c / 100;
            String ch = Double.toString(c);
            t2.setText(ch);
         } else if ((m1.equals("Unity")) && (m2.equals("KM"))) {
            JOptionPane.showMessageDialog(f, "choose unity please!!");
         } else if ((m1.equals("Unity")) && (m2.equals("CM"))) {
            JOptionPane.showMessageDialog(f, "choose unity please!!");
         } else if ((m1.equals("Unity")) && (m2.equals("M"))) {
            JOptionPane.showMessageDialog(f, "choose unity please!!");
         }
      } else if (e.getSource() == b1) {
         JOptionPane.showMessageDialog(f, "Done !!!");
         t1.setText("");
         t2.setText("");
      }

      else if (e.getSource() == b2) {
         JOptionPane.showMessageDialog(f, "Bye Bye");
         System.exit(0);
      }
   }

   public static void main(String[] args) {
      new LengthConvert();
   }

}
