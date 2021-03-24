package by.training.exercise5.run;

import by.training.exercise5.unit.DividerLogics;
import by.training.scanner.DataScanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = DataScanner.enterIntFromConsole();

        boolean result = DividerLogics.checkPerfectNumber(number);
        System.out.println("Ответ: " + result);
    }
}
