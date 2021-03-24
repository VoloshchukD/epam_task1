package by.training.exercise2.run;

import by.training.exercise2.unit.YearsLogics;
import by.training.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите год: ");
        int year = DataScanner.enterIntFromConsole();

        System.out.println("Введите номер месяца: ");
        int monthNumber = DataScanner.enterIntFromConsole();

        int result = YearsLogics.countDaysInMonthByYearAndMonthNumber(year, monthNumber);
        System.out.println("Число дней в месяце данного года: " + result);
    }
}
