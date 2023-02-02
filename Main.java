import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String postCode;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the Postal to Barcode Translator (Please enter 5 integers)");
        do{
            System.out.println("Enter your postal code: ");
            postCode = scan.next();
        }
        while(postCode.length() != 5);
        
        Methods p = new Methods(postCode);
        System.out.println(p.translate());
        scan.close();
    }
}