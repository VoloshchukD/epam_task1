package by.epamtc.exercise3.run;

import by.epamtc.exercise3.exception.InvalidRadiusValueException;
import by.epamtc.exercise3.exception.InvalidSquareValueException;
import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise3.unit.GeometryLogics;

public class Runner {
    public static void main(String[] args) throws InvalidSquareValueException, InvalidRadiusValueException {
        System.out.println("Площадь квадрата: ");
        double squareArea = DataScanner.enterDoubleFromConsole();

        double circleRadius = GeometryLogics.countCircleInSquareRadius(squareArea);
        double innerSquareArea = GeometryLogics.countSquareInCircleArea(circleRadius);
        System.out.println("Площадь квадрата внутри окружности: " + innerSquareArea);
        System.out.println("Во сколько раз площадь вписанного квадрата меньше площади заданного: " + GeometryLogics.countSquareDifference(squareArea, innerSquareArea));
    }
}
