package by.epamtc.exercise2.unit;

public class YearsLogics {

    public static final int DIVIDER1 = 4;

    public static final int DIVIDER2 = 100;

    public static final int DIVIDER3 = 400;

    public static int countDaysInMonthByYearAndMonthNumber(int year, MonthType monthType) {
        int days = 0;
        switch (monthType) {
            case THIRTY_ONE_DAY:
                days = 31;
                break;
            case THIRTY_DAY:
                days = 30;
                break;
            case VARIABLE_DAY:
                days = isLeapYear(year) ? 29 : 28;
                break;
        }
        return days;
    }

    public static boolean isLeapYear(int year) {
        return ((year % DIVIDER1 == 0) && !(year % DIVIDER2 == 0)) || (year % DIVIDER3 == 0);
    }

}
