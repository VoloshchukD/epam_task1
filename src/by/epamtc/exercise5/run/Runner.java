package by.epamtc.exercise5.run;

import by.epamtc.exercise5.unit.DividerLogics;
import by.epamtc.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = DataScanner.enterIntFromConsole();

        boolean result = DividerLogics.isPerfectNumber(number);
        System.out.println("Ответ: " + result);
    }
}
