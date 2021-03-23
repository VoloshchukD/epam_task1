package by.training.exercise1.run;

import by.training.exercise1.unit.CalculationLogics;
import by.training.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = DataScanner.enterIntFromConsole();

        int result = CalculationLogics.calculateLastDigitOfSquaredNumber(number);
        System.out.println("Последняя цифра квадрата числа: " + result);
    }
}
