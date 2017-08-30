package com.company;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        startGen(input);
    }

    public static void startGen(Scanner input) {
        System.out.println("Select number of times:");
        String timesString = input.nextLine();

        // At times like these, just try to catch some errors
        int times;
        try {
            times = parseInt(timesString);
        } 
        catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Some text");
            
            // Some people dont like return in the middle of the code and call it "spaghetti code", but i dont mind :P and i think in this case its appropriate
            return;
        }

        System.out.println("You want to print (" + times + ") times. \nSelect a symbol:");

        String symbol = input.nextLine();

        doShape(times, symbol);
    }

    public static void doShape(int numberOfTimes, String symbol) {
        for (int i = 1; i < numberOfTimes; i+=2) {
            
            // You can do this more fancy
            for (int x = 0; x < (numberOfTimes - (1 - (i / 2))); x++) { // When having multiple arithmic operations, just use some () so it is clearer that there is no accidential mistake
                System.out.print(" ");
            } 
            
            //like this
            /* char[] arr = new char[numberOfTimes - 1 - i];
            Arrays.fill(arr, ' ');
            System.out.print(new String(arr)); */
            //or with a java 8 lambda expression
            // IntStream.range(0, numberOfTimes - 1 - i).forEach(i -> System.out.print(" "));

            for (int z = 0; z < i; z++) {
                System.out.print(symbol); // Symbol is already a String, you dont need to "" + String ...
            }

            System.out.println("");
        }

        for (int i = numberOfTimes + 1; i > 0; i-=2) {
            for (int x = 0; x < numberOfTimes - 1 - i / 2; x++) {
                System.out.print(" ");
            }

            for (int z = 0; z < i; z++) {
                System.out.print("" + symbol);
            }

            System.out.println("");
        }
    }
}
