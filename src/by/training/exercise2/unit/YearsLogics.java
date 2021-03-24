package by.training.exercise2.unit;

public class YearsLogics {

    public static int countDaysInMonthByYearAndMonthNumber(int year, int monthNumber) {
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return leapYearCheck(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static boolean leapYearCheck(int year) {
        return ((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0);
    }

}
