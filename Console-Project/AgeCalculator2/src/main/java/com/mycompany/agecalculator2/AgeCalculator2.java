package com.mycompany.agecalculator2;

import java.util.Scanner;
import java.util.Calendar;

public class AgeCalculator2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentYear = calendar.get(Calendar.YEAR);

        System.out.println("THIS SOFTWARE CALCULATES AGE");
        System.out.println("Today's Date: " + currentDay + "/" + currentMonth + "/" + currentYear);
        System.out.println();

        System.out.println("Enter Birth Day:");
        int birthDay = input.nextInt();

        System.out.println("Enter Birth Month:");
        int birthMonth = input.nextInt();

        System.out.println("Enter Birth Year:");
        int birthYear = input.nextInt();

        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;
        int days = currentDay - birthDay;

        // If days is negative, borrow from months
        if (days < 0) {
            months = months - 1;

            // Get the number of days in the previous month
            int previousMonth = currentMonth - 1;
            int yearForMonth = currentYear;

            if (previousMonth == 0) {
                previousMonth = 12;
                yearForMonth = yearForMonth - 1;
            }

            // Find how many days are in that previous month
            int daysInPreviousMonth = getDaysInMonth(previousMonth, yearForMonth);
            days = days + daysInPreviousMonth;
        }

        // If months is negative, borrow from years
        if (months < 0) {
            years = years - 1;
            months = months + 12;
        }

        System.out.println();
        System.out.println("Your Age is: " + years + " years, " + months + " months, " + days + " days");
    }

    // This method returns the correct number of days in a month (handles leap year)
    public static int getDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || 
            month == 8 || month == 10 || month == 12) {
            return 31;
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } 
        else {
            // February
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
    }

    // This method checks if a year is leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
