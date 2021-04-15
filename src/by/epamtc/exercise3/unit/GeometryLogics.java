package by.epamtc.exercise3.unit;

import by.epamtc.exercise3.exception.InvalidRadiusValueException;
import by.epamtc.exercise3.exception.InvalidSquareValueException;

public class GeometryLogics {

    public static double countCircleInSquareRadius(double area) throws InvalidSquareValueException {
        if (area <= 0.0) throw new InvalidSquareValueException("Square area value is wrong");
        return Math.sqrt(area) / 2;
    }

    public static double countSquareInCircleArea(double radius) throws InvalidRadiusValueException {
        if (radius <= 0.0) throw new InvalidRadiusValueException("Radius value is wrong");
        return 2 * Math.pow(radius, 2);
    }

    public static double countSquareDifference(double square1, double square2) throws InvalidSquareValueException {
        if (square1 <= 0.0 || square2 <= 0.0) throw new InvalidSquareValueException("Square area value is wrong");
        return square1 / square2;
    }

}
