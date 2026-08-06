package GridLayout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Question10 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Adder Calculator: ");
        JTextField num1Field = new JTextField(5);
        JTextField num2Field = new JTextField(5);

        JButton addBtn = new JButton("Add (+)");
        JLabel resultLabel = new JLabel("Result: ");

        addBtn.addActionListener(e->{
            try{
                int n1 = Integer.parseInt(num1Field.getText());
                int n2 = Integer.parseInt(num2Field.getText());
                resultLabel.setText("Result: "+(n1+n2));

            }catch(NumberFormatException ex){
                resultLabel.setText("Error: Enter valid integers!");

            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Num 1: "));
        frame.add(num1Field);
        frame.add(new JLabel("Num 2: "));
        frame.add(num2Field);
        frame.add(addBtn);
        frame.add(resultLabel);

        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
