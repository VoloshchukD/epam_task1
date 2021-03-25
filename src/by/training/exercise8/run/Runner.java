package by.training.exercise8.run;

import by.training.scanner.DataScanner;
import by.training.exercise8.unit.FunctionLogics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите x: ");
        double x = DataScanner.enterDoubleFromConsole();

        double value = FunctionLogics.countFunctionValue(x);
        System.out.println("Значение функции: " + value);
    }
}
