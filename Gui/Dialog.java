import javax.swing.JOptionPane;

public class Dialog{
    
    public static void main(String[] args) {
        
        // JOptionPane.showMessageDialog(null, "Welcome to IT Department.");

        // String name = JOptionPane.showInputDialog("What's your name?");
        // String message = String.format("Welcome, %s, to IT Department!",name);

        // JOptionPane.showMessageDialog(null, message,"IT Department",0);

        
        String fno = JOptionPane.showInputDialog("Enter first number.");
        String sno = JOptionPane.showInputDialog("Enter second number.");

        int num1 = Integer.parseInt(fno);
        int num2 = Integer.parseInt(sno);

        int num3 = num1 + num2;
        // String num3 = fno + sno;

        JOptionPane.showMessageDialog(null, num3,"Greatest Calculator",0);        

    }
}