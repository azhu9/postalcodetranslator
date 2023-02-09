import javax.swing.*;

class Main {
    public static void main(String[] args) {
        String postCode = " ";
        JFrame window = new JFrame();
        do{
            try{
                postCode = JOptionPane.showInputDialog(window, "This program converts an ordinary zip code to its binary and bar code equivalent.\nWhat zip code do you want to convert");
            }
            catch(NumberFormatException e){
            }
        if(postCode == null) System.exit(0);
        }
        while(postCode.length() != 5);

        Methods p = new Methods(postCode);
        JOptionPane.showMessageDialog(window, postCode+" expressed in binary format is:\n" + p.compileBinaryCode() +"\nand expressed in bar code format is:\n" + p.compileBarCode());
    }
}