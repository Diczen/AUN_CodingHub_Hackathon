package org.sthsth;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int length = 0;
        if (args.length != 1) {
            System.err.println("""
                    Usage: 
                        passgen [length]
                    """);
            System.exit(1);
        }
        else {
            try {
                 length = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("passgen expects an integer");
                System.exit(1);
            }
        }
        Scanner input = new Scanner(System.in);
        String userInput;
        /** repeat prompt until valid response is given*/
        do {
            System.out.println("Include Symbols? (Y/N)");
            userInput = input.nextLine();

        } while (! (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("n")));
        boolean symbols = userInput.equalsIgnoreCase("y");
        System.out.println(PasswordGenerator.generate(Integer.parseInt(args[0]), symbols));
    }
}