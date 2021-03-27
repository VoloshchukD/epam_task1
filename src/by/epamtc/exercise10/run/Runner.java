package by.epamtc.exercise10.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise10.unit.FunctionLogics;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите начальное и конечное значение отрезка: ");
        double a = DataScanner.enterDoubleFromConsole();
        double b = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите шаг: ");
        double h = DataScanner.enterDoubleFromConsole();

        Map<Double, Double> result = FunctionLogics.calculateFunctionValues(a, b, h);
        printResult(result);
    }

    public static void printResult(Map<Double, Double> result) {
        result.forEach((k, v) -> System.out.printf(k + " %.3f %n", v));
    }
}
