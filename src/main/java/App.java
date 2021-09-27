/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("What is the quote? ");
        Scanner scanner = new Scanner(System.in);
        String quote = scanner.nextLine();

        System.out.print("Who said it? ");
        String character = scanner.nextLine();

        String output = String.format(character + " says, " + "\"" + quote + "\"");

        System.out.print(output);

        scanner.close();
    }
}