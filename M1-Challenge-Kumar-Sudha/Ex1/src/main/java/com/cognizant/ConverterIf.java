package com.cognizant;

public class ConverterIf implements Converter {

    public String convertMonth(int monthNumber) {
        String monthName = null;
        if (monthNumber == 1) {
            monthName = "January";
        } else if (monthNumber == 2) {
            monthName = "February";
        } else if (monthNumber == 3) {
            monthName = "March";
        } else if (monthNumber == 4) {
            monthName = "April";
        } else if (monthNumber == 5) {
            monthName = "May";
        } else if (monthNumber == 6) {
            monthName = "June";
        } else if (monthNumber == 7) {
            monthName = "July";
        } else if (monthNumber == 8) {
            monthName = "August";
        } else if (monthNumber == 9) {
            monthName = "September";
        } else if (monthNumber == 10) {
            monthName = "October";
        } else if (monthNumber == 11) {
            monthName = "November";
        } else if (monthNumber == 12) {
            monthName = "December";
        } else {
            System.out.println("The month number should be between 1 and 12. Got : " + monthNumber);
        }
        return monthName;
    }

    public String convertDay(int dayNumber) {
        String weekDay = null;
        if (dayNumber == 1) {
            weekDay = "Sunday";
        } else if (dayNumber == 2) {
            weekDay = "Monday";
        } else if (dayNumber == 3) {
            weekDay = "Tuesday";
        } else if (dayNumber == 4) {
            weekDay = "Wednesday";
        } else if (dayNumber == 5) {
            weekDay = "Thursday";
        } else if (dayNumber == 6) {
            weekDay = "Friday";
        } else if (dayNumber == 7) {
            weekDay = "Saturday";
        } else if (dayNumber == 8) {
            System.out.println("The dayNumber should be between 1 through 7. Got : " + dayNumber);
        }
        return weekDay;
    }
}
