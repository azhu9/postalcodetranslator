import javax.swing.*;

class Main {
    public static void main(String[] args) {
        String postCode = " ";
        JFrame window = new JFrame();
        Methods p = new Methods();
        do{
            try{
                postCode = JOptionPane.showInputDialog(window, "This program converts an ordinary zip code to its bar code equivalent.\nWhat zip code do you want to convert");
            }
            catch(NumberFormatException e){
            }
        if(postCode == null) System.exit(0);
        }
        while(postCode.length() != 5);
        JOptionPane.showMessageDialog(window, postCode+" expressed in bar code format is:\n" + p.translate(postCode));
    }
}