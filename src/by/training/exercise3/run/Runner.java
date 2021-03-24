package by.training.exercise3.run;

import by.training.scanner.DataScanner;
import by.training.exercise3.unit.GeometryLogics;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата: ");
        int squareArea = DataScanner.enterIntFromConsole();

        int circleRadius = GeometryLogics.countCircleInSquareRadiusBySquareArea(squareArea);
        int innerSquareArea = GeometryLogics.countSquareInCircleAreaByCircleRadius(circleRadius);
        System.out.println("Площадь квадрата внутри окружности: " + innerSquareArea);
        System.out.println("Во сколько раз площадь вписанного квадрата меньше площади заданного: " + GeometryLogics.countSquareDifference(squareArea, innerSquareArea));
    }
}
