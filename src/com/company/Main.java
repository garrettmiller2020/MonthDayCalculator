package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        userInput();
    }

    static void userInput() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What month were you born(1-12): ");
        int month = keyboard.nextInt();
        System.out.println("What day were you born on(1-31): ");
        int day = keyboard.nextInt();
        System.out.println("What year were you born:");
        int year = keyboard.nextInt();
        corrector(month, day, year);
    }

    static void corrector(int month, int day, int year) {
        if (month > 12 || month < 1 || day > 31 || day < 1) {
            System.out.println("You have entered incorrect values. Double check your response.");
            userInput();
        } else {
            zellersCongruence(month, day, year);
        }
    }

    static void zellersCongruence(int month, int day, int year) {
        if (month == 1) {
            month = 13;
            year --;
        }
        if (month == 2) {
            month = 14;
            year --;
        }
        int yearOfCentury = year % 100;
        int zeroBasedCent = year / 100;
        int ans = (day + ((13 * (month + 1)) / 5) + yearOfCentury + (yearOfCentury / 4) + (zeroBasedCent / 4) + (5 * zeroBasedCent));
        ans = ans%7;
        poem(ans);
    }

    static void poem(int ans) {
        String printState;
        switch (ans) {
            case 0:
                printState = "You were born on a saturday meaning you work hard for a living";
                break;
            case 1:
                printState = "You were born on a Sunday meaning you are fair and wise and good in every way";
                break;
            case 2:
                printState = "You were born on a Monday meaning you are fair of face";
                break;
            case 3:
                printState = "You were born on a Tuesday meaning you are full of grace";
                break;
            case 4:
                printState = "You were born on a Wednesday meaning you are full of woe";
                break;
            case 5:
                printState = "You were born on a Thursday meaning you have far to go";
                break;
            case 6:
                printState = "you were born on a Friday meaning you are loving and giving";
                break;
            default:
                printState = "You were born on a ______ meaning you have broken this program";
                userInput();
        }
        printPoem(printState);
    }

    static void printPoem(String printState) {
        System.out.println(printState);
        System.out.println("");
        doItAgain();
    }

    static void doItAgain() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to enter another date?");
        System.out.println(" [Y]  [N] ");
        String ans = keyboard.next();
        ans = ans.toUpperCase();
        if (ans.equals("Y")) {
            userInput();
        }
        else{
            System.exit(0);
        }
    }
}