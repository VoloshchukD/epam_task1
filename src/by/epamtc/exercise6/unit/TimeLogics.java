package by.epamtc.exercise6.unit;

public class TimeLogics {

    public static String convertTime(int seconds) {

        int fullHours = seconds / 3600;
        int fullMinutes = seconds / 60 - fullHours * 60;
        int fullSeconds = seconds - fullHours * 3600 - fullMinutes * 60;

        return fullHours + " hours; " + fullMinutes + " minutes; " + fullSeconds + " seconds; ";
    }

}
