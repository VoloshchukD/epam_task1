package by.epamtc.exercise2.unit;

import by.epamtc.exercise2.exception.InvalidMonthValueException;
import by.epamtc.exercise2.exception.InvalidYearValueException;
import by.epamtc.exercise2.exception.NullMonthTypeException;

import java.util.NoSuchElementException;

public class YearsLogics {

    public static final int LEAP_YEAR_FREQUENCY = 4;

    public static final int LEAP_YEAR_CORRECTION_DIVIDER = 100;

    public static final int LEAP_YEAR_CORRECTION_FREQUENCY = 400;

    public static int countDaysInMonth(int year, MonthType monthType) throws InvalidYearValueException, NullMonthTypeException {
        if (year < 0) throw new InvalidYearValueException("Month value is wrong");
        if (monthType == null) throw new NullMonthTypeException("MonthType is not initialized");

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
        return ((year % LEAP_YEAR_FREQUENCY == 0) && !(year % LEAP_YEAR_CORRECTION_DIVIDER == 0)) || (year % LEAP_YEAR_CORRECTION_FREQUENCY == 0);
    }

    public static MonthType numberToEnum(int monthNumber) throws InvalidMonthValueException {
        if (!(monthNumber > 0 && monthNumber <= 12)) throw new InvalidMonthValueException("Month value is wrong");

        MonthType monthType;
        switch (monthNumber) {
            case 4:
            case 6:
            case 9:
            case 11:
                monthType = MonthType.THIRTY_DAY;
                break;
            case 2:
                monthType = MonthType.VARIABLE_DAY;
                break;
            default:
                monthType = MonthType.THIRTY_ONE_DAY;
        }
        return monthType;
    }

}
