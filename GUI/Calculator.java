package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField display;
    
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

    JButton btnPlus, btnSub, btnMul, btnDiv, btnEqual, btnClear;

    double num1 = 0, num2 = 0, result = 0;
    char operator;

    Calculator() {
        frame = new JFrame("Calculator");
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // Display Screen
        display = new JTextField();
        display.setBounds(30, 30, 275, 40);
        display.setFont(new Font("SansSerif", Font.BOLD, 20));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(display);

        // btns
        btn7 = new JButton("7"); btn8 = new JButton("8"); btn9 = new JButton("9"); btnDiv = new JButton("/");
        btn4 = new JButton("4"); btn5 = new JButton("5"); btn6 = new JButton("6"); btnMul = new JButton("*");
        btn1 = new JButton("1"); btn2 = new JButton("2"); btn3 = new JButton("3"); btnSub = new JButton("-");
        btnClear = new JButton("C"); btn0 = new JButton("0"); btnEqual = new JButton("="); btnPlus = new JButton("+");

        // Row 1 (7,8,9,/)
        btn7.setBounds(30, 90, 60, 45);
        btn8.setBounds(100, 90, 60, 45);
        btn9.setBounds(170, 90, 60, 45);
        btnDiv.setBounds(245, 90, 60, 45);

        // Row 2 (4,5,6,*)
        btn4.setBounds(30, 150, 60, 45);
        btn5.setBounds(100, 150, 60, 45);
        btn6.setBounds(170, 150, 60, 45);
        btnMul.setBounds(245, 150, 60, 45);

        // Row 3 (1,2,3,-)
        btn1.setBounds(30, 210, 60, 45);
        btn2.setBounds(100, 210, 60, 45);
        btn3.setBounds(170, 210, 60, 45);
        btnSub.setBounds(245, 210, 60, 45);

        // Row 4 (Clear,0,=,+)
        btnClear.setBounds(30, 270, 60, 45);
        btn0.setBounds(100, 270, 60, 45);
        btnEqual.setBounds(170, 270, 60, 45);
        btnPlus.setBounds(245, 270, 60, 45);

        // add btns into Frame
        frame.add(btn7); frame.add(btn8); frame.add(btn9); frame.add(btnDiv);
        frame.add(btn4); frame.add(btn5); frame.add(btn6); frame.add(btnMul);
        frame.add(btn1); frame.add(btn2); frame.add(btn3); frame.add(btnSub);
        frame.add(btnClear); frame.add(btn0); frame.add(btnEqual); frame.add(btnPlus);

        btn7.addActionListener(this); btn8.addActionListener(this); btn9.addActionListener(this); btnDiv.addActionListener(this);
        btn4.addActionListener(this); btn5.addActionListener(this); btn6.addActionListener(this); btnMul.addActionListener(this);
        btn1.addActionListener(this); btn2.addActionListener(this); btn3.addActionListener(this); btnSub.addActionListener(this);
        btnClear.addActionListener(this); btn0.addActionListener(this); btnEqual.addActionListener(this); btnPlus.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn0) display.setText(display.getText().concat("0"));
        else if (e.getSource() == btn1) display.setText(display.getText().concat("1"));
        else if (e.getSource() == btn2) display.setText(display.getText().concat("2"));
        else if (e.getSource() == btn3) display.setText(display.getText().concat("3"));
        else if (e.getSource() == btn4) display.setText(display.getText().concat("4"));
        else if (e.getSource() == btn5) display.setText(display.getText().concat("5"));
        else if (e.getSource() == btn6) display.setText(display.getText().concat("6"));
        else if (e.getSource() == btn7) display.setText(display.getText().concat("7"));
        else if (e.getSource() == btn8) display.setText(display.getText().concat("8"));
        else if (e.getSource() == btn9) display.setText(display.getText().concat("9"));

        // Clear
        if (e.getSource() == btnClear) {
            display.setText("");
        }

        // Operator (+, -, *, /) store values when click the btns
        if (e.getSource() == btnPlus || e.getSource() == btnSub || e.getSource() == btnMul || e.getSource() == btnDiv) {
            if (!display.getText().isEmpty()) {
                num1 = Double.parseDouble(display.getText());
                if (e.getSource() == btnPlus) operator = '+';
                else if (e.getSource() == btnSub) operator = '-';
                else if (e.getSource() == btnMul) operator = '*';
                else if (e.getSource() == btnDiv) operator = '/';
                display.setText("");
            }
        }

        // (=) for final result
        if (e.getSource() == btnEqual) {
            if (!display.getText().isEmpty()) {
                num2 = Double.parseDouble(display.getText());

                switch (operator) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/': 
                        if (num2 == 0) {
                            display.setText("Error");
                            return;
                        }
                        result = num1 / num2; 
                        break;
                }
                display.setText(String.valueOf(result));
                num1 = result; // store result(values) into num1 to calculate continous
            }
        }
    }
}