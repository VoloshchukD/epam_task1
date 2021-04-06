package by.epamtc.exercise8.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise8.unit.FunctionLogics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите переменную x: ");
        double x = DataScanner.enterDoubleFromConsole();

        double value = FunctionLogics.countFunctionValue(x);
        System.out.println("Значение функции: " + value);
    }
}
