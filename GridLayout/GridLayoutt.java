package GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

// Question 5
// Practical


public class GridLayoutt {

    public static void main(String[] args){
        JFrame frame = new JFrame("GridLayout Demo");
        frame.setLayout(new GridLayout(3,2,5,5));
        
        for(int i=1; i<= 5; i++){
            frame.add(new JButton("Button "+i));
        }
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
