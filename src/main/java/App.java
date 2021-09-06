/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //Using class scanner
public class App {
    // main method begins execution of Java application
    public static void main(String[] args) {
        Scanner quote = new Scanner(System.in); //Scanner to obtain quote
        System.out.println("What is the quote?");
        String Quote = quote.nextLine();    //Reads the quote from the user

        Scanner name = new Scanner(System.in);  //Scanner to obtain name
        System.out.println("What is the name?");
        String Name = name.nextLine();  //Reads the name from the user

        //displays the name and quote store in both object name and quote
        System.out.println(Name + " says, " + "\"" + Quote + ".\"" );
    }
}