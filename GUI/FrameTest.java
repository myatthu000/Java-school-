package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameTest implements ActionListener {


    JTextField txtHello;
    JFrame frmHello;
    JButton btnSayHello;
    JButton btnClear;
    JButton btnClose;

    FrameTest(){

        txtHello = new JTextField();
        frmHello = new JFrame("MyGUI");
        btnSayHello = new JButton("Say Hello");
        btnClear = new JButton("Clear");
        btnClose = new JButton("Close");

        frmHello.setSize(400,300);
        frmHello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmHello.setLocationRelativeTo(null);
        frmHello.getContentPane().setBackground(Color.CYAN);
        frmHello.setLayout(null);

        txtHello.setBounds(100,60,200,30);
        frmHello.add(txtHello);

        btnSayHello.setBounds(25, 160, 100, 40);
        frmHello.add(btnSayHello);
        
        btnClear.setBounds(150, 160, 100, 40);
        frmHello.add(btnClear);

        btnClose.setBounds(275, 160, 100, 40);
        frmHello.add(btnClose);

        btnSayHello.addActionListener(this);
        btnClose.addActionListener(this);
        btnClear.addActionListener(this);

        

        frmHello.setVisible(true);
    }

    public static void main(String[] args) {
        new FrameTest();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnSayHello){
            txtHello.setText("hello world");
        }
        if(e.getSource() == btnClear){
            txtHello.setText("");
        }
        if(e.getSource() == btnClose){
            frmHello.dispose();
        }

    }
}
