package by.epamtc.exercise9.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise9.unit.CircleLogics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите радиус r: ");
        double r;
        do {
            r = DataScanner.enterDoubleFromConsole();
        } while (r <= 0);

        double square = CircleLogics.countSquare(r);
        double circumference = CircleLogics.countСircumference(r);
        System.out.println("Площадь: " + square);
        System.out.println("Длина окружности: " + circumference);
    }
}
