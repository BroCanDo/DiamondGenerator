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
        int times = parseInt(timesString);

        System.out.println("You want to print (" + times + ") times. \nSelect a symbol:");

        String symbol = input.nextLine();

        doShape(times, symbol);

        startGen(input);
    }

    public static void doShape(int numberOfTimes, String symbol) {
        for (int i = 1; i < numberOfTimes; i+=2) {
            for (int x = 0; x < numberOfTimes - 1 - i / 2; x++) {
                System.out.print(" ");
            }

            for (int z = 0; z < i; z++) {
                System.out.print("" + symbol);
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
