package by.epamtc.exercise7.run;

import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise7.unit.GeometryLogics;
import by.epamtc.exercise7.unit.Point;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Введите координаты x,y первой точки: ");
        int x1 = DataScanner.enterIntFromConsole();
        int y1 = DataScanner.enterIntFromConsole();

        System.out.println("Введите координаты x,y второй точки: ");
        int x2 = DataScanner.enterIntFromConsole();
        int y2 = DataScanner.enterIntFromConsole();

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);

        int comparationResult = GeometryLogics.comparePointsСoordinates(point1, point2);
        String resultAsString = GeometryLogics.makeResultString(comparationResult);
        System.out.println(resultAsString);
    }
}
