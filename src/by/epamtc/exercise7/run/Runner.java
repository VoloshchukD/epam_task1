package by.epamtc.exercise7.run;

import by.epamtc.exercise7.exception.NullPointExceptionException;
import by.epamtc.scanner.DataScanner;
import by.epamtc.exercise7.unit.GeometryLogics;
import by.epamtc.exercise7.unit.Point;

public class Runner {
    public static void main(String[] args) throws NullPointExceptionException {
        Point point1 = createPoint();
        Point point2 = createPoint();

        Point closerPoint = GeometryLogics.comparePointsСoordinates(point1, point2);
        System.out.println("точка " + closerPoint.toString() + " ближе");
    }

    public static Point createPoint() {
        System.out.println("Введите x,y координаты точки: ");
        int x = DataScanner.enterIntFromConsole();
        int y = DataScanner.enterIntFromConsole();
        return new Point(x, y);
    }

}
