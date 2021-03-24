package by.training.exercise6.unit;

public class TimeLogics {

    private static int countFullHours(int seconds) {
        return seconds / 3600;
    }

    private static int countFullMinutesConsideringFullHours(int seconds, int fullHours) {
        return seconds / 60 - fullHours * 60;
    }

    private static int countFullMinutesConsideringFullHoursAndFullMinutes(int seconds, int fullHours, int fullMinutes) {
        return seconds - fullHours * 3600 - fullMinutes * 60;
    }

    public static String convertTime(int seconds) {

        int fullHours = countFullHours(seconds);
        int fullMinutes = countFullMinutesConsideringFullHours(seconds, fullHours);
        int fullSeconds = countFullMinutesConsideringFullHoursAndFullMinutes(seconds, fullHours, fullMinutes);

        return fullHours + " hours; " + fullMinutes + " minutes; " + fullSeconds + " seconds; ";
    }

}
