package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go,");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way,");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter month(1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month(1-31): ");
        int dayOfMonth = input.nextInt();
        System.out.print("What year were you born: ");
        int year = input.nextInt();

        if (month == 1 || month == 2)
        {
            month = (month == 1) ? 13 : 14;
            year--;
        }

        int dayOfWeek = (dayOfMonth + (26 * (month + 1)) / 10 + (year % 100)
                + (year % 100) / 4 + (year / 100) / 4 + 5 * (year / 100)) % 7;

        System.out.print("You were born on a: ");
        switch(dayOfWeek)
        {
            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday");
        }
    }
}
