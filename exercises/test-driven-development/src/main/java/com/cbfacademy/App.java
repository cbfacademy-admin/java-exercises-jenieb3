package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        int year = 1956;
        if (LeapYear.isLeap(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
