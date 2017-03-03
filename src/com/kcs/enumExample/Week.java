package com.kcs.enumExample;

import java.util.EnumSet;

/**
 * Created by andriusbaltrunas on 3/2/2017.
 */
public enum Week {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6), SUNDAY(7), UNKNOWN(0);

    private int day;

    Week(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public static EnumSet<Week> getWeeks(){
        //EnumSet.of(FRIDAY, TUESDAY);
        return EnumSet.allOf(Week.class);
    }

    public static Week getWeekDay(int number){
        Week week = UNKNOWN;
        for (Week w : getWeeks()){
            if (w.getDay() == number){
                week = w;
            }
        }
        return week;
    }
}
