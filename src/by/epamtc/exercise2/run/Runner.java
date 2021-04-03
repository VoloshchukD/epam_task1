package by.epamtc.exercise2.run;

import by.epamtc.exercise2.unit.MonthType;
import by.epamtc.exercise2.unit.YearsLogics;
import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите год: ");
        int year;
        do {
            year = DataScanner.enterIntFromConsole();
        } while (year < 0);

        System.out.println("Введите номер месяца: ");
        int monthNumber;
        do {
            monthNumber = DataScanner.enterIntFromConsole();
        } while (!(monthNumber > 0 && monthNumber <= 12));

        int result = YearsLogics.countDaysInMonth(year, numberToEnum(monthNumber));
        System.out.println("Число дней в месяце данного года: " + result);
    }

    public static MonthType numberToEnum(int monthNumber) {
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
