package GUI;

import javax.swing.*;
import java.awt.event.*;

public class Notepad implements ActionListener {
    JFrame frame;
    JMenuBar mb;
    JMenu file,edit,help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;
    Notepad(){

        frame = new JFrame("Notepad");
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");


        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);
        mb.add(file);mb.add(edit);mb.add(help);

        ta = new JTextArea();
        ta.setBounds(5,5,360,320);

        frame.add(mb);
        frame.add(ta);
        frame.setJMenuBar(mb);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Notepad();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == cut) ta.cut();
        if(e.getSource() == copy) ta.copy();
        if(e.getSource() == paste) ta.paste();
        if(e.getSource() == selectAll) ta.selectAll();
        
    }
}
