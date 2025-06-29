package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {
    private JTextField num1Field, num2Field, operatorField, resultField;
    private JButton calculateBtn;

    public Gui() {
        setTitle("Colorful Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));
        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(230, 240, 255));
        Font font = new Font("Arial", Font.BOLD, 18);

        JLabel label1 = new JLabel("Enter the first number:");
        label1.setFont(font);
        add(label1);
        JTextField num1Field = new JTextField();
        num1Field.setFont(font);
        add(num1Field);

        JLabel label = new JLabel("Enter operation (+, -, *, /):");
        label.setFont(font);
        add(label);
        JTextField operatorField = new JTextField();
        operatorField.setFont(font);
        add(operatorField);

        JLabel label2 = new JLabel("Enter the second number:");
        label2.setFont(font);
        add(label2);
        num2Field = new JTextField();
        num2Field.setFont(font);
        add(num2Field);

        JButton calculateBtn = new JButton("Calculate");
        calculateBtn.setFont(font);
        calculateBtn.setBackground(new Color(100, 180, 255));
        calculateBtn.setForeground(Color.WHITE);
        calculateBtn.setFocusPainted(false);
        calculateBtn.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        add(calculateBtn);

        JLabel labelResult = new JLabel("Result:");
        labelResult.setFont(font);
        add(labelResult);
        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setFont(font);
        resultField.setBackground(new Color(255, 255, 204));
        add(resultField);

        calculateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Calculate();
            }
        });

        setVisible(true);
    }

    private void Calculate() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            char operator = operatorField.getText().charAt(0);
            double result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    result = num1 / num2;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid operator!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            resultField.setText(String.valueOf(result));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!", "Input Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

}