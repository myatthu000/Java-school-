package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import javax.swing.*;

public class LoginForm implements ActionListener{

    JFrame frame;
    JButton loginBtn;
    JLabel ELabel;
    JLabel PLabel;
    JTextField emailField;
    JPasswordField passwordField;

    LoginForm(){
        frame = new JFrame("Login Form");
        ELabel = new JLabel("Email");
        PLabel = new JLabel("Password");
        emailField = new JTextField();
        passwordField = new JPasswordField();
        loginBtn = new JButton("Login");

        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLayout(null);

        
        ELabel.setBounds(50, 50, 80, 30);
        frame.add(ELabel);
        emailField.setBounds(150,50,260,30);
        frame.add(emailField);

        PLabel.setBounds(50, 100, 80, 30);
        frame.add(PLabel);
        passwordField.setBounds(150, 100, 260, 30);
        frame.add(passwordField);
        
        loginBtn.setBounds(150, 160, 100, 35);
        frame.add(loginBtn);

        loginBtn.addActionListener(this);

        frame.setVisible(true);
    }
    

    public static void main(String[] args) {
        new LoginForm();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loginBtn) {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            if (email.equals("admin@gmail.com") && password.equals("root")) {
                JOptionPane.showMessageDialog(frame, "Login success!");
            }else{
                JOptionPane.showMessageDialog(frame, "Login fail!\nEmail or password is wrong","Error", JOptionPane.ERROR_MESSAGE);
            }
            emailField.setText("");
            passwordField.setText("");
            // System.out.printf(email, password);
        }
    }
}
