package GridLayout;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Question8 {


    public static void main(String[] args){

        JFrame frame = new JFrame("ComboBox Demo");
        String[] languages = {"Java","Python","C++","JavaScript"};

        JComboBox<String> langCombo = new JComboBox<>(languages);
        JLabel selectedLabel = new JLabel("Selected: Java");

        langCombo.addActionListener(e -> {
            String selected = (String)
            langCombo.getSelectedItem();
            selectedLabel.setText("Selected: "+selected);
        });

        frame.setLayout(new FlowLayout());
        frame.add(langCombo);
        frame.add(selectedLabel);
        frame.setSize(300,120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
