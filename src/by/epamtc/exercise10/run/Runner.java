package by.epamtc.exercise10.run;

import by.epamtc.exercise10.exception.InvalidRangeException;
import by.epamtc.exercise10.exception.InvalidStepException;
import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise10.unit.FunctionLogics;

import java.util.Map;

public class Runner {
    public static void main(String[] args) throws InvalidStepException, InvalidRangeException {
        System.out.println("Введите начальное и конечное значение отрезка: ");
        double a = DataScanner.enterDoubleFromConsole();
        double b = DataScanner.enterDoubleFromConsole();
        System.out.println("Введите шаг: ");
        double h = DataScanner.enterDoubleFromConsole();

        Map<Double, Double> result = FunctionLogics.calculateFunctionValues(a, b, h);
        System.out.println(FunctionLogics.resultToString(result));
    }

}
