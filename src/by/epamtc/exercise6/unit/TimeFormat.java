package by.epamtc.exercise6.unit;

public class TimeFormat {

    public TimeFormat() {
    }

    public TimeFormat(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    private int hours;

    private int minutes;

    private int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeFormat that = (TimeFormat) o;
        return hours == that.hours && minutes == that.minutes && seconds == that.seconds;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + hours;
        result = 37 * result + minutes;
        result = 37 * result + seconds;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() + "{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
