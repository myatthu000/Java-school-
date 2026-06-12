import javax.swing.JOptionPane;

public class Dialog3{
    
    public static void main(String[] args) {
        
        // JOptionPane.showMessageDialog(null, "Welcome to IT Department.");

        // String name = JOptionPane.showInputDialog("What's your name?");
        // String message = String.format("Welcome, %s, to IT Department!",name);

        // JOptionPane.showMessageDialog(null, message,"IT Department",0);

        
        String fno = JOptionPane.showInputDialog("Enter first number.");
        String sno = JOptionPane.showInputDialog("Enter second number.");
        String sign = JOptionPane.showInputDialog("Enter sign(+ - * /");

        int num1 = Integer.parseInt(fno);
        int num2 = Integer.parseInt(sno);
        
        int num3 = 0;

        if (sign.equals("+")) {
            num3 = num1 + num2;
            
        }else if(sign.equals("-")){
            num3 = num1 - num2;

        }else if(sign.equals("*")){
            num3 = num1 * num2;
            
        }else if(sign.equals("/")){
            if (num2 != 0) {
                num3 = num1 / num2;
            }else{
                // JOptionPane.showMessageDialog(null,"Cannot divided by zero!",0);
            }
            
        }

        // int num3 = num1 + num2;
        // String num3 = fno + sno;

        JOptionPane.showMessageDialog(null, num3,"My Greatest Calculator",0);
        

    }
}