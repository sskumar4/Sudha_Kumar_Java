package com.cognizant;

public class ConverterSwitch implements Converter {
    public String convertMonth(int monthNumber) {
        String monthName = null;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("The month number should be between 1 and 12. Got : " + monthNumber);
                monthName = null;
        }
        return monthName;
    }


    public String convertDay(int dayNumber) {
        String weekDay = null;
        switch (dayNumber) {
            case 1:
                weekDay = "Sunday";
                break;
            case 2:
                weekDay = "Monday";
                break;
            case 3:
                weekDay = "Tuesday";
                break;
            case 4:
                weekDay = "Wednesday";
                break;
            case 5:
                weekDay = "Thursday";
                break;
            case 6:
                weekDay = "Friday";
                break;
            case 7:
                weekDay = "Saturday";
                break;
            default:
                System.out.println("The dayNumber should be between 1 through 7. Got : " + dayNumber);
                weekDay = null;
                break;
        }
        return weekDay;
    }
}
