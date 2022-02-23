package com.company;

import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {

        //call scanner to read user input
        Scanner myScanner = new Scanner(System.in);

        //declare array accepting five Strings
        String[] fiveWords = new String[5];

        //prompt user to input five words
        System.out.println("Please enter five words.");

        //use for loop to compile user input into array
        for (int i = 0; i < fiveWords.length; i++) {
            String userInput = myScanner.nextLine();
            fiveWords[i] = userInput;
        }

        //display user input
        System.out.println("\n" + "These were the five words you entered:");

        //use enhanced for loop to print input
        for (String x: fiveWords) {
            System.out.println(x);
       }
    }
}
