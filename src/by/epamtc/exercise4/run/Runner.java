package by.epamtc.exercise4.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise4.unit.BooleanLogics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите число A: ");
        int numberA = DataScanner.enterIntFromConsole();
        System.out.println("Введите число B: ");
        int numberB = DataScanner.enterIntFromConsole();
        System.out.println("Введите число C: ");
        int numberC = DataScanner.enterIntFromConsole();
        System.out.println("Введите число D: ");
        int numberD = DataScanner.enterIntFromConsole();

        int[] inputData = {numberA, numberB, numberD, numberC};

        boolean result = BooleanLogics.isEvenNumbers(inputData);
        System.out.println("Ответ: " + result);
    }
}
