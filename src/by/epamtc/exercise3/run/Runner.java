package by.epamtc.exercise3.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise3.unit.GeometryLogics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата: ");
        double squareArea;
        do {
            squareArea = DataScanner.enterDoubleFromConsole();
        } while (squareArea <= 0);

        double circleRadius = GeometryLogics.countCircleInSquareRadius(squareArea);
        double innerSquareArea = GeometryLogics.countSquareInCircleArea(circleRadius);
        System.out.println("Площадь квадрата внутри окружности: " + innerSquareArea);
        System.out.println("Во сколько раз площадь вписанного квадрата меньше площади заданного: " + GeometryLogics.countSquareDifference(squareArea, innerSquareArea));
    }
}
