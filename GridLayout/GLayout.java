package GridLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GLayout extends JFrame {
    public GLayout(){
        setLayout(new GridLayout(3,1));
        add(new JButton("One"));
        add(new JButton("Two"));
        add(new JButton("Three"));
    }

    public static void main(String[] args) {
        GLayout gui = new GLayout();
        gui.setSize(200,200);
        gui.setVisible(true);
    }
}
