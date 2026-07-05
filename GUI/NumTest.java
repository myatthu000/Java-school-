package GUI;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class NumTest implements ActionListener {
    JFrame frame;
    JLabel label1;
    JLabel label2;
    JLabel result;
    JButton plusBtn;
    JButton substractBtn;
    JButton multiplyBtn;
    JButton divisionBtn;
    JTextField inputField1; // num 1
    JTextField inputField2; // num 2
    JTextField inputField3; // num 3: Enter your expected solution.

    NumTest(){
        frame = new JFrame("Input Number Calculator");
        label1 = new JLabel("First Number");
        label2 = new JLabel("Second Number");
        result = new JLabel("Result");
        inputField1 = new JTextField();
        inputField2 = new JTextField();
        inputField3 = new JTextField();
        plusBtn = new JButton("+");
        substractBtn = new JButton("-");
        multiplyBtn = new JButton("*");
        divisionBtn = new JButton("/");


        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        // first input 
        label1.setBounds(50,50,100,30);
        frame.add(label1);
        inputField1.setBounds(150,50,280,30);
        frame.add(inputField1);

        // sec input
        label2.setBounds(50,100,100,30);
        frame.add(label2);
        inputField2.setBounds(150,100,280,30);
        frame.add(inputField2);

        // third input: expect result
        result.setBounds(50,150,100,30);
        frame.add(result);
        inputField3.setBounds(150,150,280,30);
        frame.add(inputField3);

        plusBtn.setBounds(50,200,100,30);
        substractBtn.setBounds(150,200,100,30);
        multiplyBtn.setBounds(250,200,100,30);
        divisionBtn.setBounds(350,200,100,30);
        frame.add(plusBtn);
        frame.add(substractBtn);
        frame.add(multiplyBtn);
        frame.add(divisionBtn);

        plusBtn.addActionListener(this);
        substractBtn.addActionListener(this);
        multiplyBtn.addActionListener(this);
        divisionBtn.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new NumTest();
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(inputField1.getText().isEmpty() || inputField2.getText().isEmpty() || inputField3.getText().isEmpty()){
            JOptionPane.showMessageDialog(frame, "Fields are empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }


        Float calculatedResult=0.0f;
        String s1 = new String(inputField1.getText());
        String s2 = new String(inputField2.getText());
        String s3 = new String(inputField3.getText());

        Float f1 = Float.parseFloat(s1);
        Float f2 = Float.parseFloat(s2);
        Float f3 = Float.parseFloat(s3);
        String operator = "";
        
        if (e.getSource() == plusBtn) {
            calculatedResult = f1+f2;
            operator = "+";
        }else if ((e.getSource() == substractBtn)) {
            calculatedResult = f1-f2;
            operator = "-";
        }else if ((e.getSource() == multiplyBtn)) {
            calculatedResult = f1*f2;
            operator = "*";
        }else if ((e.getSource() == divisionBtn)) {
            calculatedResult = f1/f2;
            operator = "/";
        }

        String infoMessage = "First Number: " + f1 + "\n"
                           + "Second Number: " + f2 + "\n"
                           + "Calculation: " + f1 + " " + operator + " " + f2 + " = " + calculatedResult + "\n"
                           + "Your Expected Answer: " + f3;


        if (calculatedResult.equals(f3)) {
            JOptionPane.showMessageDialog(frame, infoMessage + "\n\nYour answers is correct!");
        }else{
            JOptionPane.showMessageDialog(frame, infoMessage +"\n\nYour answers is wrong!");
        }
    }
}
