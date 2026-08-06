package GridLayout;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

// Question 7
// Practical

public class Question7 {
    public static void main(String[] args){
        JFrame frame = new JFrame("Radio Button Demo");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");

        //Group radio
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Select Gender: "));
        frame.add(maleRadio);
        frame.add(femaleRadio);

        frame.setSize(300,120);
        frame.setVisible(true);

    }
}
