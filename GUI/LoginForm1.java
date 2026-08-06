package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class LoginForm1 implements ActionListener{

    JFrame frame;
    JButton loginBtn;
    JLabel ELabel;
    JLabel PLabel;
    JTextField emailField;
    JPasswordField passwordField;
    JPanel mypanel;
    JPanel btnPanel;
    JCheckBox showPassword;

    LoginForm1(){
        frame = new JFrame("Login Form");

        mypanel = new JPanel();
        btnPanel = new JPanel();

        mypanel.setBounds(50, 50, 400, 100);
        btnPanel.setBounds(200, 200, 100, 30);
        
        ELabel = new JLabel("Email");
        PLabel = new JLabel("Password");
        emailField = new JTextField();
        passwordField = new JPasswordField();
        loginBtn = new JButton("Login");

        frame.setSize(500,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setLayout(null);

        frame.add(mypanel);
        frame.add(btnPanel);
 


        mypanel.setLayout(new GridLayout(2,2,10,10));
        mypanel.add(ELabel);
        // emailField.setBounds(150,50,260,30);
        mypanel.add(ELabel);
        mypanel.add(emailField);

        mypanel.add(PLabel);
        mypanel.add(passwordField);

        btnPanel.setLayout(new GridLayout(1,3,10,10));
        btnPanel.add(loginBtn);



        loginBtn.addActionListener(this);

        frame.setVisible(true);
    }
    

    public static void main(String[] args) {
        new LoginForm1();
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
