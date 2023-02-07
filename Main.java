import javax.swing.*;

class Main {
    public static void main(String[] args) {
        String postCode = " ";
        JFrame window = new JFrame();
        Methods p = new Methods();
        do{
            try{
                postCode = JOptionPane.showInputDialog(window, "Enter a Postal Code to Translate\nPlease only enter 5 digits");
            }
            catch(NumberFormatException e){
            }
        if(postCode == null) System.exit(0);
        }
        while(postCode.length() != 5);
        JOptionPane.showMessageDialog(window, "Your Postal Code in Binary:\n" + p.translate(postCode));
    }
}