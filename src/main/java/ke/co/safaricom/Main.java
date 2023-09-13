package ke.co.safaricom;
import ke.co.safaricom.services.Cipher;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome! This Caeser application will help you to encrypt or decrypt your message with a private key.");

        Cipher cipher = new Cipher();

        while(true){

            System.out.println("Please enter your message:");
            String message = scanner.nextLine();  // Using next() prevents app from accepting spaces as part of the input and breaks out to skip the immediate next input

            System.out.print("Enter the process to execute (e/d):");
            String process = scanner.next();

            System.out.print("Enter your private key: ");
            int key = scanner.nextInt();

            cipher.setMessage(message);
            cipher.setKey(key);

            String output = "";

            if(process.startsWith("e")){
                output = cipher.encrypt();
            } else if(process.startsWith("d")){   // enforcing process to be either encrypt or decrypt, otherwise do nothing without breaking code
               output =  cipher.decrypt();
            }

            System.out.println("Your message is:" + output);

            System.out.print("Would you like to continue? (yes or no):");
            String nextStep = scanner.next();
            scanner.nextLine();

            if(!nextStep.startsWith("y")) {
                System.out.print("Thank you for using this service and goodbye! ");
                System.out.println("If you did not get any results, please check and ensure you select a process that is either encrypt or decrypt");
                break;
            }

        }
    }
}