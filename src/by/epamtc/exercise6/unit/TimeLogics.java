package by.epamtc.exercise6.unit;

public class TimeLogics {

    public static final int SECONDS_IN_HOUR = 3600;

    public static final int SECONDS_IN_MINUTE = 60;

    public static final int MINUTES_IN_HOUR = 60;

    public static TimeFormat convertSeconds(int seconds) {
        int fullHours = seconds / SECONDS_IN_HOUR;
        int fullMinutes = seconds / SECONDS_IN_MINUTE - fullHours * MINUTES_IN_HOUR;
        int fullSeconds = seconds - fullHours * SECONDS_IN_HOUR - fullMinutes * SECONDS_IN_MINUTE;

        TimeFormat timeFormat = new TimeFormat(fullHours, fullMinutes, fullSeconds);
        return timeFormat;
    }

}
