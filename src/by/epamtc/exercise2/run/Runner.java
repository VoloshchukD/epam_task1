package by.epamtc.exercise2.run;

import by.epamtc.exercise2.exception.InvalidMonthValueException;
import by.epamtc.exercise2.exception.InvalidYearValueException;
import by.epamtc.exercise2.exception.NullMonthTypeException;
import by.epamtc.exercise2.unit.YearsLogics;
import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) throws InvalidMonthValueException, InvalidYearValueException, NullMonthTypeException {
        System.out.println("Введите год: ");
        int year = DataScanner.enterIntFromConsole();

        System.out.println("Введите номер месяца: ");
        int monthNumber = DataScanner.enterIntFromConsole();

        int result = YearsLogics.countDaysInMonth(year, YearsLogics.numberToEnum(monthNumber));
        System.out.println("Число дней в месяце данного года: " + result);
    }

}
