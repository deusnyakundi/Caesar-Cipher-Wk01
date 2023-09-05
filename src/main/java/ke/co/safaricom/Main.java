package ke.co.safaricom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello and welcome! This Caeser application will help you to encrypt or decrypt your message with a private key.");

        while(true){

            System.out.println("Please enter your message");
            String message = scanner.next();

            System.out.print("Enter the process to execute (e/d):");
            String process = scanner.next();

            System.out.print("Enter your private key: ");
            int key = scanner.nextInt();

            System.out.print("Would you like to continue? (yes or no):");
            String nextStep = scanner.next();


            if(!nextStep.startsWith("y")) {
                System.out.print("Thank you and goodbye!");
                break;
            }

        }
    }
}