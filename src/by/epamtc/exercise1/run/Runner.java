package by.epamtc.exercise1.run;

import by.epamtc.exercise1.unit.CalculationLogics;
import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = DataScanner.enterIntFromConsole();

        int result = CalculationLogics.calculateLastSquaredDigit(number);
        System.out.println("Последняя цифра квадрата числа: " + result);
    }
}
