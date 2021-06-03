/*
 *  UCF COP3330 Summer 2021 Exercise 4 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String noun = myApp.readNoun();
        String verb = myApp.readVerb();
        String adjective = myApp.readAdjective();
        String adverb = myApp.readAdverb();
        String output = myApp.generateOutputString(verb, adjective, noun, adverb);

        myApp.displayOutput(output);
    }

    public String readNoun() {
        System.out.print("Enter a noun: ");
        return in.nextLine();
    }

    public String readVerb() {
        System.out.print("Enter a verb: ");
        return in.nextLine();
    }

    public String readAdjective() {
        System.out.print("Enter a adjective: ");
        return in.nextLine();
    }

    public String readAdverb() {
        System.out.print("Enter a adverb: ");
        return in.nextLine();
    }

    public String generateOutputString(String verb, String adjective, String noun, String adverb) {
        return String.format("Do you %s your %s %s %s? That's hilarious!", verb, adjective, noun, adverb);
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }
}
