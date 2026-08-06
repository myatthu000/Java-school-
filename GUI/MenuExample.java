package GUI;

import javax.swing.*;;
public class MenuExample {
    JMenu menu, subMenu;
    JMenuItem i1,i2,i3,i4,i5;
    JFrame frame;
    MenuExample(){
        frame = new JFrame("Menu and MenuItem example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        subMenu = new JMenu("Sub Menu");
        
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(i3);
        subMenu.add(i4);
        subMenu.add(i5);

        menu.add(subMenu);
        mb.add(menu);
        frame.setJMenuBar(mb);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}
