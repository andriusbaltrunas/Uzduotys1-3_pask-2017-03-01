package com.kcs.enumExample;

/**
 * Created by andriusbaltrunas on 3/2/2017.
 */
public class MyEnumMainApp {

    public static void main(String[] args) {
        Week week = Week.FRIDAY;
        int dayNumb = Week.MONDAY.getDay();

        printWeekDays();

        System.out.println(Week.getWeekDay(3));
    }

    private static void printWeekDays(){
        for(Week day: Week.getWeeks()){
            System.out.println("Day >>" + day.name() + " value >>" + day.getDay());
        }
    }
}
