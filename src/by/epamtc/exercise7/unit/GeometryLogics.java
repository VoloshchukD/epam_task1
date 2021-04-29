package by.epamtc.exercise7.unit;

import by.epamtc.exercise7.exception.NullPointExceptionException;

public class GeometryLogics {

    public static int countHypotenuse(int leg1, int leg2) {
        return (int) Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));
    }

    public static Point comparePointsСoordinates(Point point1, Point point2) throws NullPointExceptionException {
        if (point1 == null || point2 == null) throw new NullPointExceptionException("Point is not initialized");
        int hypotenuse1 = countHypotenuse(point1.getX(), point1.getY());
        int hypotenuse2 = countHypotenuse(point2.getX(), point2.getY());

        Point closerPoint = point1;
        if (hypotenuse1 < hypotenuse2) {
            closerPoint = point2;
        }

        return closerPoint;
    }

}
